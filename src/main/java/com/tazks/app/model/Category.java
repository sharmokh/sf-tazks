package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Category {

    @Id
    private UUID id;
    private String name;
    private Byte[] image;

    @ManyToMany
    private Set<Handyman> handymen;

}
