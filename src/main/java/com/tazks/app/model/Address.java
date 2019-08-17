package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Address extends BaseEntity {

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(Long id, String street, String city, String state, String zipCode) {
        super(id);
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
