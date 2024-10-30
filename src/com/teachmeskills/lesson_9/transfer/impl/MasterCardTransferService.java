package com.teachmeskills.lesson_9.transfer.impl;

import com.teachmeskills.lesson_9.model.account.Account;
import com.teachmeskills.lesson_9.model.card.BaseCard;
import com.teachmeskills.lesson_9.model.document.Check;
import com.teachmeskills.lesson_9.transfer.CardTransferService;
import com.teachmeskills.lesson_9.utils.Constants;

import java.util.Date;

public class MasterCardTransferService implements CardTransferService {

    @Override
    public Check transferFromCardToCard(BaseCard sendingCard, BaseCard receivingCard, int amountTransfer) {
        return processTransfer(sendingCard, receivingCard, amountTransfer);
    }

    @Override
    public Check transferFromCardToAccount(BaseCard sendingCard, Account receivingAccount, int amountTransfer) {
        return processTransfer(sendingCard, receivingAccount, amountTransfer);
    }

    private Check processTransfer(BaseCard sendingCard, Object receivingEntity, int amountTransfer) {
        if (amountTransfer < 0) {
            System.out.println("Transfer amount cannot be negative.");
            return null;
        }

        if (sendingCard.checkCardLimitTransfer(amountTransfer)) {
            System.out.println("Transfer limit exceeded. Amount: " + amountTransfer +
                    ", Limit: " + Constants.TRANSFER_LIMIT_MASTER_CARD);
            return new Check(0, "132 AM", new Date(), sendingCard, "The transaction was rejected! ");
        }

        if (sendingCard.amount < amountTransfer) {
            System.out.println("Insufficient funds. Available: " + sendingCard.amount +
                    ", Requested: " + amountTransfer);
            return new Check(0, "112 EM", new Date(), sendingCard, "The transaction was rejected! ");
        }

        sendingCard.amount -= amountTransfer;
        if (receivingEntity instanceof BaseCard) {
            ((BaseCard) receivingEntity).amount += amountTransfer;
        } else if (receivingEntity instanceof Account) {
            ((Account) receivingEntity).amount += amountTransfer;
        }

        return new Check(amountTransfer, "187 MX", new Date(), sendingCard, "The transaction is approved! ");
    }
}