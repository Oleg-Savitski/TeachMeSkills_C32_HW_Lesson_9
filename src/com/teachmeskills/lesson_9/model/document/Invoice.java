package com.teachmeskills.lesson_9.model.document;

import java.time.LocalDate;

/** добавлены поля, конструтор, метод, set&get.
 */

public class Invoice {
    private String invoiceNumber; // Номер инвойса
    private String recipient; // Получатель
    private String sender;  // Отправитель
    private double amount; // Сумма
    private LocalDate date; // Дата
    private String comment; // Комментарий

    public Invoice(String invoiceNumber, String recipient, double amount, String sender, LocalDate date, String comment) {
        this.invoiceNumber = invoiceNumber;
        this.recipient = recipient;
        this.amount = amount;
        this.sender = sender;
        this.date = date;
        this.comment = comment;
    }

    public void showInvoiceInfo() {
        System.out.println(" -- INVOICE -- ");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Recipient: " + recipient);
        System.out.println("Sender: " + sender);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date);
        System.out.println("Comment on the account statement" + comment);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
}