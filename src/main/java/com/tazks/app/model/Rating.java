package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Rating extends BaseEntity {

    private int stars;
    private String text;
    private Byte[] image;

    public Rating(Long id, int stars, String text, Byte[] image) {
        super(id);
        this.stars = stars;
        this.text = text;
        this.image = image;
    }
}
