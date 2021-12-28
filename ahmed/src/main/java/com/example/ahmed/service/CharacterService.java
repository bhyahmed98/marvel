package com.example.ahmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ahmed.model.character;
import com.example.ahmed.repository.CharacterRepository;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public character addCharacter(character c) {
        return characterRepository.save(c);
    }

    public List<character> getAllCharacter() {
        return (List<character>) characterRepository.findAll();
    }

    public Optional<character> getCharacter(Long id) {
        return characterRepository.findById(id);
    }

}
