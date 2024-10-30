package com.teachmeskills.lesson_9.model.account;

import com.teachmeskills.lesson_9.model.document.TransactionHistory;

public class Account {

        public String accountNumber;
        public double amount;
        public TransactionHistory transactionHistory; // новое поле.

        public Account(String accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
            this.transactionHistory = new TransactionHistory(); // иницилизация.
        }

    public TransactionHistory getTransactionHistory() { // новый метод.
        return transactionHistory;
    }
}