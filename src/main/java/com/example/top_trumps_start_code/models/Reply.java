package com.example.top_trumps_start_code.models;

public class Reply {

    private String message;

    public Reply(String message) {
        this.message = message;
    }

    public Reply() {
    }

//    GETTERS & SETTERS

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
