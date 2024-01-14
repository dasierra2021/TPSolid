package com.example.pokedex;


import com.example.pokedex.controllers.PokemonController;
import com.example.pokedex.exceptions.PokemonCommandLineParsingException;
import com.example.pokedex.models.AppOptions;
import com.example.pokedex.models.PokeViewBuilder;
import com.example.pokedex.models.Pokemon;
import com.example.pokedex.utilities.CommandLineParser;
import com.example.pokedex.utilities.MultipleFormatGenerator;
import com.example.pokedex.utilities.OutputFormat;
import com.example.pokedex.views.PokemonViewAPI;
import com.example.pokedex.views.PokemonViewSQLite;
import org.apache.commons.cli.*;
import com.example.pokedex.utilities.ConsoleOutputUtility;
import com.example.pokedex.utilities.OutputFormat;

public class Pokedex {
    public static void main(String[] args) throws ParseException, PokemonCommandLineParsingException {
        AppOptions appOptions = new AppOptions();
        /* Parse the command line arguments, this is done for you, keep this code block */
        try {
            //Parsing the inputted arguments as application options
            appOptions = CommandLineParser.parseCommandLineArguments(args);
        } catch (PokemonCommandLineParsingException e) {
            System.err.println(e.getMessage());
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("./Pokedex <PokemonId> [-d|--database <databaseFile>] [-f|--format <format>]", e.getOptions());
            System.exit(0);
        }

        // Obtaining the ID, creating the controller and the view
        int pokemonId = appOptions.getPokemonId();
        PokemonController newController = new PokemonController();
        MultipleFormatGenerator pokeview = null;

        // Selecting the view according to the data source parameter
        if(appOptions.getDataSource() == AppOptions.DataSource.WEB_API) {
            pokeview = PokeViewBuilder.createPokemonViewAPI(newController.getPokemonwithID(pokemonId));
        }
        else{
            pokeview = PokeViewBuilder.createPokemonViewSQLite(newController.getPokemonwithID(pokemonId, appOptions.getDatabasePath()));
        }

        // Creating the output
        ConsoleOutputUtility consoleOutputUtility = new ConsoleOutputUtility(appOptions.getOutputFormat(), pokeview);
        consoleOutputUtility.makeOutput();
    }


}
