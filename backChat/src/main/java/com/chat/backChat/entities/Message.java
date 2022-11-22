package com.chat.backChat.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    public Message(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private DateTimeFormat datetime;
        private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTimeFormat getDatetime() {
        return datetime;
    }

    public void setDatetime(DateTimeFormat datetime) {
        this.datetime = datetime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

