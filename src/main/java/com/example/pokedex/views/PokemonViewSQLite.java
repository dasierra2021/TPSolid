package com.example.pokedex.views;

import com.example.pokedex.models.Pokemon;
import com.example.pokedex.models.PokemonSQLite;
import com.example.pokedex.utilities.MultipleFormatGenerator;

public class PokemonViewSQLite implements MultipleFormatGenerator {

    private final PokemonSQLite pokemon;
    public PokemonViewSQLite(PokemonSQLite pokemon){
        this.pokemon=pokemon;
    }
    public String generateHTML(){
        return "<h1>"+pokemon.getName()+"</h1>\n"+
                "<ul>\n"+
                "<li>Id :"+ pokemon.getID()+"</li>\n"+
                "<li>Taille : "+pokemon.getHeight()+"</li>\n"+
                "<li>Poids : "+pokemon.getWeight()+"</li>\n"+
                "<li>Description  : "+pokemon.getDescription()+"</li>\n"+
                "</ul>\n";
    }
    public String generateCSV() {
        return "Id;Name;Height;Weight;Description;\n" +
                pokemon.getID() + ";" + pokemon.getName() + ";" + pokemon.getHeight() + ";" + pokemon.getWeight() + ";" + pokemon.getDescription();
    }

    public String generateHumanReadableText(){
        return "=============================\n"+
                "Pokémon # "+ pokemon.getID() + "\n"+
                "Nom : "+pokemon.getName()+"\n"+
                "Taille : "+pokemon.getHeight()+"\n"+
                "Poids : "+ pokemon.getWeight()+"\n"+
                "Description : "+ pokemon.getDescription()+"\n"+
                "=============================\n";

    }
}
