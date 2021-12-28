package com.example.ahmed.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.ahmed.model.character;

public interface CharacterRepository extends CrudRepository<character, Long> {

}
