package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;

@Data
@Entity
public class Handyman extends Person {

    private Set<Category> categories;
    private Set<Job> jobs;
    private Set<Rating> ratings;
    private Set<Message> messages;

    public Handyman(Long id, String firstName, String lastName, Set<Category> categories, Set<Job> jobs,
                    Set<Rating> ratings, Set<Message> messages) {
        super(id, firstName, lastName);
        this.categories = categories;
        this.jobs = jobs;
        this.ratings = ratings;
        this.messages = messages;
    }
}
