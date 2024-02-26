package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/top_trumps")
public class TopTrumpsController {

    @PostMapping
    public ResponseEntity<Reply> playGame(@RequestBody ArrayList<Card> cards){
        Reply reply = new Reply();
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }
}
