package com.example.pokedex.models;

public class Pokemon {
    private int id;
    private String name;
    private float height;
    private float weight;

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
