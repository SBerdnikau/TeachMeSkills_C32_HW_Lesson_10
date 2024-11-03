package com.teachmeskills.lesson_10.task1.model.card;

import java.util.Objects;

public class Card {
    private final String cvv;
    private final String cardNumber;
    private final double balance;

    public Card(String cvv, String cardNumber, double balance) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cvv, card.cvv) && Objects.equals(cardNumber, card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }

    @Override
    public String toString() {
        return "№ "+ this.cardNumber + ", CVV:" + this.cvv;
    }

    public String getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }
}