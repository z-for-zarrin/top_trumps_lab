package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/top_trumps")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

    @PostMapping
    public ResponseEntity<String> startGame() {
        String reply = topTrumpsService.startNewGame();
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @PostMapping(value = "/play")
    public ResponseEntity<String> playGame(@RequestBody ArrayList<Card> cards){
        String reply = topTrumpsService.checkWinner(cards.get(0), cards.get(1));
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

/*    EXTENSION
        - instantiate new deck at start of game
        - check cards are in deck before they're played
        - remove cards from deck after they've been played
 */
}
