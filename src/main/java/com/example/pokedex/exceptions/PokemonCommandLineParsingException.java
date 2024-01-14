package com.example.pokedex.exceptions;

import org.apache.commons.cli.Options;

public class PokemonCommandLineParsingException extends Exception {
/*
    Existing class located on the main and segregated in a different package.
* */
    private Options options;

    public PokemonCommandLineParsingException(String msg, Options options) {
        super(msg);
        this.options = options;
    }

    public Options getOptions() {
        return options;
    }

};
