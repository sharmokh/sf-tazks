package com.tazks.app.model;

import lombok.*;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public Person(Long id, String firstName, String lastName, String email, String password) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
}
