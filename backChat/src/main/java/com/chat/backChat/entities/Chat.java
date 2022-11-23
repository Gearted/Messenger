package com.chat.backChat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat {
    public Chat(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
