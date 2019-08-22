package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@Data
@MappedSuperclass
public class Person {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;

    public Person(UUID id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
