package com.example.pokedex.controllers;


import com.example.pokedex.models.Pokemon;
import com.example.pokedex.services.PokemonAPIpokeapi;

public class PokemonController {
    public Pokemon getPokemonwithID(int id){
        // Search the pokemon using the api
        return new PokemonAPIpokeapi().getPokemonInfobyId(id);
    }
}
