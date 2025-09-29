package org.example;

public class Card {
    private int value; // A=1, 2=2, 3=3, 4=4, 5=5
    private char suit; // H=Hearts (cơ), D=Diamonds (rô), C=Clubs (tép), S=Spades (bích)

    public Card(int value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return value + String.valueOf(suit);
    }
}
