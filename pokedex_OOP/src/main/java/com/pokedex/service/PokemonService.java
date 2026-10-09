package com.pokedex.service;

import com.pokedex.model.Pokemon;
import com.pokedex.repository.PokemonRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PokemonService {
    private final PokemonRepository repository;

    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }

    public Pokemon addPokemon(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    public List<Pokemon> getAllPokemon() {
        return repository.findAll();
    }

    public List<Pokemon> getByType(String type) {
        return repository.findByType(type);
    }
}
