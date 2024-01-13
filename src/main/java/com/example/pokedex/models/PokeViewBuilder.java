package com.example.pokedex.models;

import com.example.pokedex.views.PokemonViewAPI;
import com.example.pokedex.views.PokemonViewSQLite;

public class PokeViewBuilder {
    public static PokemonViewAPI createPokemonViewAPI(Pokemon pokemon){
        return new PokemonViewAPI(pokemon);
    }
    public static PokemonViewSQLite createPokemonViewSQLite(PokemonSQLite pokemon){return new PokemonViewSQLite(pokemon);
    }
}
