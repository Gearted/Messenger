package com.chat.backChat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Message {
    public Message(){}

    @Id
    @GeneratedValue(strategy = Ge)
}
