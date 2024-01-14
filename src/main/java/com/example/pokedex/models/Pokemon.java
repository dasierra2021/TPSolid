package com.example.pokedex.models;

public class Pokemon {
    //A model designed to contain all the relevant information of a Pokémon
    private final int id;
    private final String name;
    private final float height;
    private final float weight;

    public Pokemon(int id, String name, float height, float weight){
        this.id=id;
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }

    public float getHeight(){
        return height;
    }

    public float getWeight(){
        return weight;
    }


}
