package com.example.top_trumps_start_code.models;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    public Card(){};

    public String toString() {
        return this.rank + " of " + this.suit;
    }

//    GETTERS & SETTERS

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getCardValue(){
        return this.rank.getValue();
    }
}
