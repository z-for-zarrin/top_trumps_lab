package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

@Service
public class TopTrumpsService {

    public TopTrumpsService() {
    }

    public String checkWinner(Card card1, Card card2){
        Card winner;
        if(card1.getRank().getValue() >= card2.getRank().getValue()){
            winner = card1;
        } else {
            winner = card2;
        }
        return String.format("%s of %s wins!", winner.getRank(), winner.getSuit());
    }

}
