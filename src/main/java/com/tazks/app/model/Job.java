package com.tazks.app.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Job {

    @Id
    private UUID id;
    private Date dateTime;
    private int price;
    private String proposal;

    @OneToOne
    private Category category;
    @OneToOne
    private Address address;
    @OneToOne
    private Rating rating;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Handyman handyman;
    @ManyToMany
    private Set<Message> messages;

}
