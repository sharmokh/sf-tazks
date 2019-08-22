package com.tazks.app.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Rating {

    @Id
    private UUID id;
    private int stars;
    private String text;
    private Byte[] image;

}
