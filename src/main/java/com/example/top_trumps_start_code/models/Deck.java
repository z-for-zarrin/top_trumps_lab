package com.example.top_trumps_start_code.models;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

//    Constructor that loops through possible cards and adds them to ArrayList
    public Deck() {
        this.cards = new ArrayList<>();
//        loop through suits
//        within that loop through ranks
//        create card and add to deck for each combination of suit and rank
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                this.cards.add(new Card(rank, suit));
            }
        }
    }

//    Methods:
//    - Getters and setters
//    - Check for cards
//    - Remove card

    public boolean isInDeck(Card inputCard) {
        for(Card card : this.cards) {
            if(card.getRank() == inputCard.getRank() &&
               card.getSuit() == inputCard.getSuit()) {
                return true;
            }
        }
        return false;
    }

//    Note: doesn't work as intended because cards referenced in games are different objects to cards in deck
//    ArrayList.
    public void removeCard(Card card){
        this.cards.remove(card);
    }

//    GETTERS & SETTERS


    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}