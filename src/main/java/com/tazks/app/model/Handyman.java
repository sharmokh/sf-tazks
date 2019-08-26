package com.tazks.app.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Handyman extends Person {

    @ManyToMany
    private Set<Category> categories;
    @ManyToMany
    private Set<Job> jobs;
    @ManyToMany
    private Set<Rating> ratings;
    @ManyToMany
    private Set<Message> messages;

}
