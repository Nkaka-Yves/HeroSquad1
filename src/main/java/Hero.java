import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private  int age;
    private String specialPower;
    private String weakness;
    private int id;
    private int squadId;
    private static List<Hero> heroes = new ArrayList<Hero>();

  public Hero(String name,int age,String specialPower,String weakness,int squadId){
     this.name = name;
     this.age = age;
     this.specialPower = specialPower;
     this.weakness = weakness;
     this.squadId = squadId;
     Squad squad = Squad.find(squadId);
     squad.addHero(this);
     heroes.add(this);
     this.id = heroes.size();
  }

  public int getSquadId(){
      return squadId;
  }
  public int getId(){
      return id;
  }
  public static List<Hero> getHeroList(){
      return heroes;
  }
  public String getName(){
      return name;
  }
  public int getAge(){
      return age;
  }
  public String getSpecialPower(){
      return specialPower;
  }
  public String getWeakness(){
      return weakness;
  } public static Hero findHero(int n) {
      return heroes.get(n-1);
    }
    public static void clearAll(){
      heroes.clear();
    }

}
