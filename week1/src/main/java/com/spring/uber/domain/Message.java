package com.spring.uber.domain;

public class Message {

    private String name;
    private String text;

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName(){
        return this.name;
    }

    public String getText(){
        return this.text;
    }

}