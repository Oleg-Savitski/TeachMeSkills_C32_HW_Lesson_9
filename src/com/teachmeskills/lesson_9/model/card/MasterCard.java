package com.teachmeskills.lesson_9.model.card;

import com.teachmeskills.lesson_9.utils.Constants;

import java.util.Date;

public class MasterCard extends BaseCard {

    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, String country, double amount) {
        super(cardNumber, cvv, validDate, cardHolder, currency, amount);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(int amountForTransfer) {
        if (amountForTransfer < 0) {
            System.out.println("Transfer amount cannot be negative.");
            return false;
        }
        if (amountForTransfer > Constants.TRANSFER_LIMIT_MASTER_CARD) {
            System.out.println("Transfer amount exceeds the limit of " + Constants.TRANSFER_LIMIT_MASTER_CARD);
            return false;
        }
        return true;
    }

    @Override
    public void showBaseInfo() {
        System.out.println("* MasterCard information *");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Balance: " + amount);
        System.out.println("Valid Until: " + validDate);
        System.out.println("Country: " + country + "\n");
    }
}