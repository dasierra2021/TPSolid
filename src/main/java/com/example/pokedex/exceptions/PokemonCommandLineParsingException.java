package com.example.pokedex.exceptions;

import org.apache.commons.cli.Options;

public class PokemonCommandLineParsingException extends Exception {

    private Options options;

    public PokemonCommandLineParsingException(String msg, Options options) {
        super(msg);
        this.options = options;
    }

    public Options getOptions() {
        return options;
    }

};
