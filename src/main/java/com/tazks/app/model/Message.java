package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
public class Message {

    @Id
    private UUID id;
    private Date dateTime;
    private String message;

}
