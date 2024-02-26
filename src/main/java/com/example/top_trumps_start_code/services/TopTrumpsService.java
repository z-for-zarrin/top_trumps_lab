package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Deck;
import org.springframework.stereotype.Service;

@Service
public class TopTrumpsService {

    private Deck deck;

    public TopTrumpsService() {
    }

    public String startNewGame() {
        this.deck = new Deck();
        return "New game ready to start!";
    }

    public String checkWinner(Card card1, Card card2){
        Card winner;

        if(this.deck.isInDeck(card1)) {
            this.deck.removeCard(card1);
        } else {
            return "Card 1 not in deck!";
        }

        if(this.deck.isInDeck(card2)) {
            this.deck.removeCard(card2);
        } else {
            return "Card 2 not in deck!";
        }

        if(card1.getCardValue() == card2.getCardValue()) {
            return "It's a draw!";
        }

        if(card1.getCardValue() > card2.getCardValue()){
            winner = card1;
        } else {
            winner = card2;
        }
        return String.format("%s of %s wins!", winner.getRank(), winner.getSuit());
    }

//    GETTERS & SETTERS

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }
}
