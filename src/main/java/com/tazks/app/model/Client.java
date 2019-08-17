package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;

@Data
@Entity
public class Client extends Person {

    private Set<Job> jobs;
    private Set<Message> messages;

    public Client(Long id, String firstName, String lastName, Set<Job> jobs, Set<Message> messages) {
        super(id, firstName, lastName);
        this.jobs = jobs;
        this.messages = messages;
    }
}
