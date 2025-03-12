import java.util.ArrayList;

public class Forest extends Area {
    private ArrayList<Pokemon> forestList = new ArrayList<>();

    public ArrayList<Pokemon> getForestList() {
        return forestList;
    }

    @Override
    public void addPokemon(Pokemon pokemon, ArrayList<Pokemon> list) {
        super.addPokemon(pokemon, list);
    }

    @Override
    public void showAllPokemon(ArrayList<Pokemon> list) {
        System.out.println("\nPokémon i skoven:");
        super.showAllPokemon(list);
    }

    @Override
    public Pokemon searchPokemonByName(String name, ArrayList<Pokemon> list) {
        return super.searchPokemonByName(name, list);
    }

    @Override
    public Pokemon searchPokemonByType(String type, ArrayList<Pokemon> list) {
        return super.searchPokemonByType(type, list);
    }
}
