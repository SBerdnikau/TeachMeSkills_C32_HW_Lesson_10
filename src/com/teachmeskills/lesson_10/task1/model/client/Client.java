package com.teachmeskills.lesson_10.task1.model.client;

import com.teachmeskills.lesson_10.task1.model.card.Card;

public class Client {
    private String name;
    private Card[] cards;
    private int cardCount;

    public Client(String name, int maxCountCard) {
        this.cards = new Card[maxCountCard];
        this.name = name;
        this.cardCount = 0;
    }

    public void addCard(String cvv, String cardNumber, double balance) {
        if (cardCount < cards.length) {
            cards[cardCount] = new Card(cvv, cardNumber, balance);
            cardCount++;
        } else {
            System.out.println("You can't add more cards.");
        }

    }

    public void countDuplicateCards() {

        int count = 0;

        if (cards == null) {
            System.out.println(this.name + " client doesn't have a bank card.");
        } else {
            for (int i = 0; i < cards.length; i++) {
                for (int j = i + 1; j < cards.length; j++) {
                    if (cards[i].equals(cards[j])) {
                        System.out.println(cards[i] + " is a duplicate of " + cards[j] + " cards.");
                        count++;
                    }
                }
            }
        }

        if (count < 0) {
            System.out.println("You don't have duplicate cards");
        } else {
            System.out.println(this.name + " client has " +
                    count + " duplicate cards.");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }
}
