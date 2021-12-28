package com.example.ahmed.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.example.ahmed.model.character;
import com.example.ahmed.service.CharacterService;

@Controller
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/newAddCharacter")
    public character newAddCharacter(character c) {
        return characterService.addCharacter(c);
    }

    @GetMapping("/getall")
    public List<character> getAllCharacter() {
        return characterService.getAllCharacter();
    }

    @GetMapping("/getCharacter")
    public Optional<character> newAddCharacter(Long id) {
        return characterService.getCharacter(id);
    }

    public void parseCharacter() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://gateway.marvel.com:443/v1/public/characters?apikey=10773382c5f0d2c654c45fa2bf7eb304";
        String result = restTemplate.getForObject(url, String.class);

    }
}