package com.example.top_trumps_start_code.models;

public class Runner {
    public static void main(String[] args) {
        Deck test = new Deck();
        System.out.println(test.getCards());

        Card aceOfDiamonds = new Card(Rank.ACE, Suit.DIAMONDS);
        System.out.println(aceOfDiamonds);
        System.out.println(test.isInDeck(aceOfDiamonds));


    }
}
