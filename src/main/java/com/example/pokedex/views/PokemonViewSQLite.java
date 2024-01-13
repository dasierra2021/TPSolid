package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonSQLite;

public class PokemonViewSQLite {

    private final PokemonSQLite pokemon;
    public PokemonViewSQLite(PokemonSQLite pokemon){
        this.pokemon=pokemon;
    }

    public String CommandLineOutput(){
        return "=============================\n"+
                "Pokémon # "+ pokemon.getID() + "\n"+
                "Nom : "+pokemon.getName()+"\n"+
                "Taille : "+pokemon.getHeight()+"\n"+
                "Poids : "+ pokemon.getWeight()+"\n"+
                "Description : "+ pokemon.getDescription()+"\n"+
                "=============================\n";

    }
}
