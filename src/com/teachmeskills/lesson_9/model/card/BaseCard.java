package com.teachmeskills.lesson_9.model.card;

import com.teachmeskills.lesson_9.model.document.TransactionHistory;

import java.util.Date;

public abstract class BaseCard {

    public String cardNumber;
    public int cvv;
    public Date validDate;
    public String cardHolder;
    public String currency;
    public double amount;
    public TransactionHistory transactionHistory; // новое поле.

    public BaseCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, double amount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validDate = validDate;
        this.cardHolder = cardHolder;
        this.currency = currency;
        this.amount = amount;
        this.transactionHistory = new TransactionHistory(); // иницилизация.
    }

    public abstract boolean checkCardLimitTransfer(int amountForTransfer);

    public TransactionHistory getTransactionHistory() { // новый метод.
        return transactionHistory;
    }

    public void showBaseInfo() {
        System.out.println("* Card Information *");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Balance: " + amount + " " + currency);
        System.out.println("Valid Until: " + validDate);
        System.out.println("Card Holder: " + cardHolder + "\n");
    }
}