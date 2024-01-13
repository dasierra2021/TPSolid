package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.utilities.MultipleFormatGenerator;

public class PokemonViewAPI implements MultipleFormatGenerator {
    private final Pokemon pokemon;
    public PokemonViewAPI(Pokemon pokemon){
        this.pokemon=pokemon;
    }
    public String generateHTML(){
        return "<h1>"+pokemon.getName()+"</h1>\n"+
            "<ul>\n"+
            "<li>Id :"+ pokemon.getID()+"</li>\n"+
            "<li>Taille : "+pokemon.getHeight()+"</li>\n"+
            "<li>Poids : "+pokemon.getWeight()+"</li>\n"+
            "</ul>\n";
    }
    public String generateCSV(){
        return "Id;Name;Height;Weight;\n"+
                pokemon.getID()+";"+pokemon.getName()+";"+pokemon.getHeight()+";"+pokemon.getWeight();
    }
    public String generateHumanReadableText(){
        return "=============================\n"+
        "Pokémon # "+ pokemon.getID() + "\n"+
        "Nom : "+pokemon.getName()+"\n"+
        "Taille : "+pokemon.getHeight()+"\n"+
        "Poids : "+ pokemon.getWeight()+"\n"+
                "=============================\n";

    }

}
