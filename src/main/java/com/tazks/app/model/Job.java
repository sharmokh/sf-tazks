package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Job extends BaseEntity {

    private Date dateTime;
    private int price;
    private String proposal;
    private Category category;
    private Address address;
    private Rating rating;
    private Client client;
    private Handyman handyman;
    private Set<Message> messages;

    public Job(Long id, Date dateTime, int price, String proposal, Category category, Address address, Rating rating,
               Client client, Handyman handyman, Set<Message> messages) {
        super(id);
        this.dateTime = dateTime;
        this.price = price;
        this.proposal = proposal;
        this.category = category;
        this.address = address;
        this.rating = rating;
        this.client = client;
        this.handyman = handyman;
        this.messages = messages;
    }
}
