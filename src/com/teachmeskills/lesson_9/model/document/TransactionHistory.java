package com.teachmeskills.lesson_9.model.document;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private final List<Check> transactions;

    public TransactionHistory() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Check check) { // для добавления транзакции в историю.
        transactions.add(check);
    }

    public void showHistory() { // для отображения истории транзакций.
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        System.out.println(" -----Transaction History----- ");
        for (Check check : transactions) {
            check.showCheckInfo();
        }
    }
}