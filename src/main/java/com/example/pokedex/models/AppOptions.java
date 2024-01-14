package com.example.pokedex.models;

import com.example.pokedex.utilities.OutputFormat;

public class AppOptions {
    // Application options that were previously located on the main method but were moved to a single class.
    public enum DataSource {WEB_API, LOCAL_DATABASE}
    private DataSource dataSource = DataSource. WEB_API;
    private String databasePath;
    private OutputFormat outputFormat = OutputFormat.TEXT;
    private int pokemonId;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setDatabasePath(String databasePath) {
        this.databasePath = databasePath;
    }

    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public int getPokemonId() {
        return pokemonId;
    }

    public OutputFormat getOutputFormat() {
        return outputFormat;
    }

    public String getDatabasePath() {
        return databasePath;
    }


    }



