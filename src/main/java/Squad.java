import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private int squadSize;
    private String reason;
    private int id;
    private static List<Squad> squads = new ArrayList<Squad>();
    private List<Hero> heroesList = new ArrayList<Hero>();

    public Squad(String squadName, int squadSize, String reason) {
        this.squadName = squadName;
        this.squadSize = squadSize;
        this.reason = reason;
        squads.add(this);
        this.id = squads.size();
    }

    // public static Squad find() {

    //
    public String getSquadName() {
        return squadName;
    }

    public int getSquadSize() {
        return squadSize;
    }

    public String getReason() {
        return reason;
    }

    public int getId() {
        return id;
    }

    public List<Hero> getHeroesList() {
        return heroesList;
    }

    public void addHero(Hero hero) {
        if (heroesList.size() < this.getSquadSize()) {
            heroesList.add(hero);
        }
    }

    public static List<Squad> getSquads() {
        return squads;
    }

    public static void clearSquads() {
        squads.clear();
    }

    public static Squad find(int n) {
        return squads.get(n - 1);
    }

    public void removeHero(Hero Hero) {
        heroesList.remove(Hero);
    }
    public void removeHeroes(){
        heroesList.clear();
    }
}