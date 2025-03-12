public class Main {
    public static void main(String[] args) {
        // Opret skoven og tilføj Pokémoner
        Forest forest = new Forest();
        Ocean ocean = new Ocean();

        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10));
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12));
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8));
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7));
        //Tilføjede to nye pokemons - Jens.
        forest.addPokemon(new Pokemon("Caterpie", "Bug", 4));
        forest.addPokemon(new Pokemon("Metapod", "Bug", 8));
        ocean.addPokemon(new Pokemon("Starmie", "Water", 20));
        ocean.addPokemon(new Pokemon("Staryu", "Water", 14));
        ocean.addPokemon(new Pokemon("Psyduck", "Water/Psychic", 13));

        // Vis alle Pokémoner i skoven
        forest.showAllPokemon();
        ocean.showAllPokemon();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        // Ændrede Charmander til Squirtle
        ash.searchForPokemon(forest, "name", "Squirtle");
        ash.searchForPokemon(ocean, "name", "Staryu");

        // Træneren søger efter en Pokémon baseret på type
        // Ændrede type til Fire fra Water
        ash.searchForPokemon(ocean, "type", "Water");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Mewtwo");
        ash.searchForPokemon(ocean, "name", "Gyarados");
    }
}
