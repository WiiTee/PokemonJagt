import java.util.ArrayList;

public class Ocean extends Area {
    private ArrayList<Pokemon> oceanList = new ArrayList<>();

    public ArrayList<Pokemon> getOceanList() {
        return oceanList;
    }

    @Override
    public void addPokemon(Pokemon pokemon, ArrayList<Pokemon> list) {
        super.addPokemon(pokemon, list);
    }

    @Override
    public void showAllPokemon(ArrayList<Pokemon> list) {
        System.out.println("\nPokémon i havet:");
        super.showAllPokemon(list);
    }

    @Override
    public Pokemon searchPokemonByType(String type, ArrayList<Pokemon> list) {
        return super.searchPokemonByType(type, list);
    }

    @Override
    public Pokemon searchPokemonByName(String name, ArrayList<Pokemon> list) {
        return super.searchPokemonByName(name, list);
    }
}
