package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;

public class PokemonViewAPI {
    private final Pokemon pokemon;
    public PokemonViewAPI(Pokemon pokemon){
        this.pokemon=pokemon;
    }

    public String CommandLineOutput(){
        return "=============================\n"+
        "Pokémon # "+ pokemon.getID() + "\n"+
        "Nom : "+pokemon.getName()+"\n"+
        "Taille : "+pokemon.getHeight()+"\n"+
        "Poids : "+ pokemon.getWeight()+"\n"+
                "=============================\n";

    }

}
