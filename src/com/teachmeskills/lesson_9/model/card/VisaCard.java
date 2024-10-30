package com.teachmeskills.lesson_9.model.card;

import com.teachmeskills.lesson_9.utils.Constants;

import java.util.Date;

public class VisaCard extends BaseCard {

    private double CASHBACK_VISA_CARD = 0.005;

    public VisaCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, double CASHBACK_VISA_CARD, double amount) {
        super(cardNumber, cvv, validDate, cardHolder, currency, amount);
        this.CASHBACK_VISA_CARD = CASHBACK_VISA_CARD;
    }

    @Override
    public boolean checkCardLimitTransfer(int amountForTransfer) {
        if (amountForTransfer < 0) {
            System.out.println("Transfer amount cannot be negative.");
            return false;
        }
        if (amountForTransfer > Constants.TRANSFER_LIMIT_VISA_CARD) {
            System.out.println("Transfer amount exceeds the limit of " + Constants.TRANSFER_LIMIT_VISA_CARD);
            return false;
        }
        return true;
    }

    @Override
    public void showBaseInfo() {
        System.out.println("* Visa Card Information *");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Balance: " + amount);
        System.out.println("Valid Until: " + validDate);
        System.out.println("Cashback: " + CASHBACK_VISA_CARD + "%\n");
    }
}