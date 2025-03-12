import java.util.ArrayList;

public class Trainer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public void searchForPokemon(Area area, String searchType, String value, ArrayList<Pokemon> list) {
        Pokemon foundPokemon = null;

        if (searchType.equalsIgnoreCase("name")) {
            foundPokemon = area.searchPokemonByName(value, list);
        } else if (searchType.equalsIgnoreCase("type")) {
            foundPokemon = area.searchPokemonByType(value, list);
        }

        if (foundPokemon != null) {
            System.out.println(name + " fandt en " + foundPokemon);
        } else {
            System.out.println(name + " kunne ikke finde en Pokémon med " + searchType + " '" + value + "'.");
        }
    }
}
