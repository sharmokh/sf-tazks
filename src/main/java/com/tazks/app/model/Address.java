package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Address {

    @Id
    private UUID id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

}
