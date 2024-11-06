package com.teachmeskills.lesson_10.task1.service;

import com.teachmeskills.lesson_10.task1.model.card.Card;
import com.teachmeskills.lesson_10.task1.model.client.Client;

public class ServiceOperationCard {
    public static int getDuplicateCards(Client client, Card[] cards) {

        int countDuplicate = 0;

        if (cards == null) {
            System.out.println(client.getName() + " client doesn't have a bank card.");
            return -1;
        } else if (cards.length == 1) {
            System.out.println(client.getName() + " client have only one bank card.");
            return 0;
        } else {
            for (int i = 0; i < cards.length; i++) {
                for (int j = i + 1; j < cards.length; j++) {
                    System.out.println(cards[i] + " is a duplicate of " + cards[j] + " cards.");
                    if (cards[i].equals(cards[j])) {
                        System.out.println("These are cards equals.");
                        countDuplicate++;
                        System.out.println("Count duplicates are  " + countDuplicate);
                    }else {
                        System.out.println("These are not cards equals.");
                    }
                    System.out.println("-------------------------------------------------------");
                }
                System.out.println("============================================================");
            }
        }

        if (countDuplicate < 0) {
            System.out.println("You don't have duplicate cards");
        } else {
            System.out.println(client.getName() + " client has " +
                    countDuplicate + " duplicate cards.");
        }

        return countDuplicate;

    }
}
