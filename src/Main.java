public class Main {
    public static void main(String[] args) {
        // Opret skoven og tilføj Pokémoner
        Forest forest = new Forest();
        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10));
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12));
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8));
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7));

        // Vis alle Pokémoner i skoven
        forest.showAllPokemon();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemon(forest, "name", "Charmander");

        // Træneren søger efter en Pokémon baseret på type
        ash.searchForPokemon(forest, "type", "Water");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Mewtwo");
    }
}
