import java.util.ArrayList;

public class Area {
    private ArrayList<Pokemon> pokemonList = new ArrayList<>();

    public ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void addPokemon(Pokemon pokemon, ArrayList<Pokemon> list) {
        list.add(pokemon);
    }

    public void showAllPokemon(ArrayList<Pokemon> list) {
        for (Pokemon p : list) {
            System.out.println(p);
        }
    }

    public Pokemon searchPokemonByName(String name, ArrayList<Pokemon> list) {
        for (Pokemon p : list) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Pokemon searchPokemonByType(String type, ArrayList<Pokemon> list) {
        for (Pokemon p : list) {
            if (p.getType().equalsIgnoreCase(type)) {
                return p;
            }
        }
        return null;
    }
}
