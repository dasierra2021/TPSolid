package com.example.pokedex.models;

import com.example.pokedex.views.PokemonViewAPI;

public class PokeViewBuilder {
    public static PokemonViewAPI createPokemonViewAPI(Pokemon pokemon){
        return new PokemonViewAPI(pokemon);
    }
}
