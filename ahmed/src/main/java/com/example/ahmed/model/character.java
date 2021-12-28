package com.example.ahmed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class character {

    @Id
    Long id;

    String name;

    String descrition;

    String imageUrl;

    Date modified;

    String resourceURL;

    @ManyToOne
    @JoinColumn(name = "id")
    Comics comics;
}
