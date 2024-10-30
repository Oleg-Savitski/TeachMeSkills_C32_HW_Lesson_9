package com.teachmeskills.lesson_9.model.client;

import com.teachmeskills.lesson_9.model.account.Account;
import com.teachmeskills.lesson_9.model.card.BaseCard;

public class LegalClient extends BaseClient {

    String legalClientNumber;

    public LegalClient(String name, Account[] accounts, BaseCard[] cards) {
        super(name, accounts, cards);
    }
}