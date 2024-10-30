package com.teachmeskills.lesson_9.model.document;
import com.teachmeskills.lesson_9.model.card.BaseCard;

import java.util.Date;

public class Check {
    String transactionId;
    public int transferAmount;
    public Date transferDate;
    public BaseCard card;
    String comment;

    public Check(int transferAmount, String transactionId, Date transferDate, BaseCard card, String comment) {
        this.transferAmount = transferAmount;
        this.transactionId = transactionId;
        this.transferDate = transferDate;
        this.card = card;
        this.comment = comment;
    }

    public void showCheckInfo() {
        System.out.println(" --TRANSFER CHECK-- ");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Transfer from card: " + card.cardNumber);
        System.out.println("Date: " + transferDate);
        System.out.println("Amount: " + transferAmount);
        System.out.println("Comment on the receipt: " + comment);
        System.out.println("----------------------------------");
    }
}