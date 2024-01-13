package com.example.pokedex.models;

public class PokemonSQLite extends Pokemon{
    private final String description;

    public PokemonSQLite(int id, String name, float height, float weight, String description){
        super(id,name,height,weight);
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }
}
