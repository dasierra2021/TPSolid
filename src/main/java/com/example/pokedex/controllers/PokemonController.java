package com.example.pokedex.controllers;


import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonSQLite;
import com.example.pokedex.services.PokemonAPIpokeapi;
import com.example.pokedex.services.PokemonSQLiteServ;

public class PokemonController {
    // A controller that handles the high-level requests and carries them to the low-level operations.
    public PokemonSQLite getPokemonwithID(int id, String dbpath){
        // Search the pokemon using the sqlite database
        return new PokemonSQLiteServ().getPokemonInfobyId(id,dbpath);
    }

    public Pokemon getPokemonwithID(int id){
        // Search the pokemon using the api
        return new PokemonAPIpokeapi().getPokemonInfobyId(id);
    }
}
