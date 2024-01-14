package com.example.pokedex.services;
import com.example.pokedex.models.PokemonSQLite;

import java.sql.*;
public class PokemonSQLiteServ {
    //The service for obtaining the information from the SQLite database and assigning it to a Pokemon
    public PokemonSQLite getPokemonInfobyId(int id, String dbpath) {
        /* Connect to the database */
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:\\Users\\dasie\\Documents\\MSc\\S9\\MajeureComputerScience\\IngLogicielle\\SOLID\\TP\\TPSolid\\pokemondatabase.sqlite";
            if (dbpath!=null){
                url=dbpath;
            }
            // create a connection to the database
            conn = DriverManager.getConnection(url);


            PreparedStatement stmt  = conn.prepareStatement("SELECT name, weight, height, description FROM pokemons WHERE id = ?");
            stmt.setInt(1, id);
            ResultSet rs    = stmt.executeQuery();
            rs.next();
            return new PokemonSQLite(
                    id,
                    rs.getString("name"),
                    Float.parseFloat(rs.getString("height")),
                    Float.parseFloat(rs.getString("weight")),
                    rs.getString("description"));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
