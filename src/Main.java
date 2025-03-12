public class Main {
    public static void main(String[] args) {
        // Opret skoven og tilføj Pokémoner
        Forest forest = new Forest();
        Ocean ocean = new Ocean();

        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10), forest.getForestList());
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12), forest.getForestList());
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8), forest.getForestList());
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7), forest.getForestList());
        //Tilføjede to nye pokemons - Jens.
        forest.addPokemon(new Pokemon("Caterpie", "Bug", 4), forest.getForestList());
        forest.addPokemon(new Pokemon("Metapod", "Bug", 8), forest.getForestList());
        ocean.addPokemon(new Pokemon("Starmie", "Water", 20), ocean.getOceanList());
        ocean.addPokemon(new Pokemon("Staryu", "Water", 14), ocean.getOceanList());
        ocean.addPokemon(new Pokemon("Psyduck", "Water/Psychic", 13), ocean.getOceanList());

        // Vis alle Pokémoner i skoven
        forest.showAllPokemon(forest.getPokemonList());
        ocean.showAllPokemon(ocean.getOceanList());

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        // Ændrede Charmander til Squirtle
        ash.searchForPokemon(forest, "name", "Squirtle", forest.getForestList());
        ash.searchForPokemon(ocean, "name", "Staryu", ocean.getOceanList());

        // Træneren søger efter en Pokémon baseret på type
        // Ændrede type til Fire fra Water
        ash.searchForPokemon(ocean, "type", "Water", ocean.getOceanList());

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Mewtwo", forest.getForestList());
        ash.searchForPokemon(ocean, "name", "Gyarados", ocean.getOceanList());
    }
}
