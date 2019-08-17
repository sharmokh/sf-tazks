package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Set;

@Data
@Entity
public class Category extends BaseEntity {

    private String name;
    private Byte[] image;
    private Set<Handyman> handymen;

    public Category(Long id, String name, Byte[] image, Set<Handyman> handymen) {
        super(id);
        this.name = name;
        this.image = image;
        this.handymen = handymen;
    }
}
