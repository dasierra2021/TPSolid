# TPSolid
By: Diego Sierra.

The application is a Pokédex: it gives information about any provided Pokémon.
First, clone the repository into your computer. In the project folder, build the project by running:
```
./gradlew build
```
To run the application, execute:
```
./gradlew run <pokemonId>
```
where pokemonId is the id of the desired Pokémon. Two additional options are included:

```
./gradlew run <pokemonId> -d databasepath -f format
```
where:
- databasepath is the path of an sqlite database containing the Pokémon information (be sure to use the prefix 'jdbc:sqlite:' before inputting the absolute path of the database)
- format is a format between html, csv or text.

The database option is used in case you'd like to use a local sqlite file to load the Pokédex instead of the default web API.
The output format option is used in case you'd like a different format for the output information.

Be sure to check the commits in the repository to see each step getting done.