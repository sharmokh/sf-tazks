package com.tazks.app.model;

import lombok.Builder;
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
public class Client extends Person {

    @ManyToMany
    private Set<Job> jobs;
    @ManyToMany
    private Set<Message> messages;

    @Builder
    public Client(Long id, String firstName, String lastName, String email, String password,
                  Set<Job> jobs, Set<Message> messages) {
        super(id, firstName, lastName, email, password);
        this.jobs = jobs;
        this.messages = messages;
    }
}
