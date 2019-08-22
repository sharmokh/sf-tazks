package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Client extends Person {

    @ManyToMany
    private Set<Job> jobs;
    @ManyToMany
    private Set<Message> messages;

    public Client(UUID id, String firstName, String lastName, Set<Job> jobs, Set<Message> messages) {
        super(id, firstName, lastName);
        this.jobs = jobs;
        this.messages = messages;
    }
}
