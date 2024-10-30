package com.teachmeskills.lesson_9.transfer;

import com.teachmeskills.lesson_9.model.account.Account;
import com.teachmeskills.lesson_9.model.card.BaseCard;
import com.teachmeskills.lesson_9.model.document.Check;

public interface CardTransferService {

    Check transferFromCardToCard(BaseCard sendingCard, BaseCard receivingCard, int amountTransfer);

    Check transferFromCardToAccount(BaseCard sendingCard, Account receivingAccount, int amountTransfer);
}