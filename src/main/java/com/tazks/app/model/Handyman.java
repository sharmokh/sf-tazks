package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Handyman extends Person {

    @ManyToMany
    private Set<Category> categories;
    @ManyToMany
    private Set<Job> jobs;
    @ManyToMany
    private Set<Rating> ratings;
    @ManyToMany
    private Set<Message> messages;

    public Handyman(UUID id, String firstName, String lastName, Set<Category> categories, Set<Job> jobs,
                    Set<Rating> ratings, Set<Message> messages) {
        super(id, firstName, lastName);
        this.categories = categories;
        this.jobs = jobs;
        this.ratings = ratings;
        this.messages = messages;
    }
}
