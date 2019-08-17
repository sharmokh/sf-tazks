package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class Message extends BaseEntity {

    private Date dateTime;
    private String message;
    private Person sender;
    private Person recipient;

    public Message(Long id, Date dateTime, String message, Person sender, Person recipient) {
        super(id);
        this.dateTime = dateTime;
        this.message = message;
        this.sender = sender;
        this.recipient = recipient;
    }
}
