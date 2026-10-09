package com.pokedex.controller;

import com.pokedex.model.Pokemon;
import com.pokedex.service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @PostMapping
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return service.addPokemon(pokemon);
    }

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return service.getAllPokemon();
    }

    @GetMapping("/search")
    public List<Pokemon> searchByType(@RequestParam String type) {
        return service.getByType(type);
    }
}
