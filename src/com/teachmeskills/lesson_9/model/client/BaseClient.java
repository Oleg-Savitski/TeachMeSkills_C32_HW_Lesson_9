package com.teachmeskills.lesson_9.model.client;

import com.teachmeskills.lesson_9.model.account.Account;
import com.teachmeskills.lesson_9.model.card.BaseCard;
import com.teachmeskills.lesson_9.model.document.TransactionHistory;

public abstract class BaseClient {
    String clientName;
    Account[] accounts;
    BaseCard[] cards;
    public TransactionHistory transactionHistory; // новое поле.

    public BaseClient(String clientName, Account[] accounts, BaseCard[] cards) {
        this.clientName = clientName;
        this.accounts = accounts;
        this.cards = cards;
        this.transactionHistory = new TransactionHistory(); // иницилизация.
    }

    public TransactionHistory getTransactionHistory() { // новый метод.
        return transactionHistory;
    }

    public String getClientName() {
        return clientName;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public BaseCard[] getCards() {
        return cards;
    }

}