package com.example.ahmed.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Comics {

    @Id
    Long id;

    String title;

    double issueNumber;

    @OneToMany(mappedBy = "character")
    List<character> characters;

}
