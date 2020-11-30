import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

public class SquadTest {
    @Test
    public void testIfSquadInstancesAreCorrect(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        assertTrue(bodyBuilder instanceof Squad);
    }
    @Test
    public void testIfGetSquadNameRetunsStringName(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
       assertEquals("bodyBuilders", bodyBuilder.getSquadName());
    }
    @Test
    public void testIfGetSquadSizeReturnsAnInteger(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        assertEquals(10, bodyBuilder.getSquadSize());
    }
    @Test
    public void testIfGetReasonReturnsAString(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        assertEquals("can fight", bodyBuilder.getReason());
    }
    @Test
    public void testIfGetIdIsAUniqueId(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        assertEquals(1, bodyBuilder.getId());
    }
    @Test
    public void testIfSquadListReturnAllSquads(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        assertTrue(Squad.getSquads().contains(bodyBuilder));
    }
    @Test
    public void testIfAddHeroAddsHeroesCorrectly(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        assertEquals(10, bodyBuilder.getSquadSize());
    }
    @Test
    public void testIfGetHeroesReturnsAListOfHeroes(){
        Squad bodyBuilder = new Squad("bodyBuilders",10,"can fight");
        Hero newHero = new Hero("Dada",20,"Rocket Launcher","Speaking",bodyBuilder.getId());
        bodyBuilder.addHero(newHero);
        List<Hero> expectedOutPut = new ArrayList<Hero>();
        expectedOutPut.add(newHero);
        assertEquals(expectedOutPut.get(0), bodyBuilder.getHeroesList().get(0));
    }
    @Test
    public void testIfAddHeroesDoesntWorkIfInteredSquadSizeIsExceed(){
        Squad bodyBuilder = new Squad("bodyBuilders",1,"can fight");
        Hero newHero = new Hero("Dada",20,"Rocket Launcher","Speaking",bodyBuilder.getId());
        Hero newHero2 = new Hero("Mucyo",21,"sniper","Sleeping",bodyBuilder.getId());
        bodyBuilder.addHero(newHero);
        bodyBuilder.addHero(newHero2);
        assertTrue(bodyBuilder.getHeroesList().contains(newHero));
        assertFalse(bodyBuilder.getHeroesList().contains(newHero2));
    }
    @Test
    public void testIfRemoveHeroRemoveOneHero(){
        Squad bodyBuilder = new Squad("bodyBuilders",1,"can fight");
        Hero newHero = new Hero("Dada",20,"Rocket Launcher","Speaking",bodyBuilder.getId());
        Hero newHero2 = new Hero("Mucyo",21,"sniper","Sleeping",bodyBuilder.getId());
        bodyBuilder.addHero(newHero);
        bodyBuilder.addHero(newHero2);
        bodyBuilder.removeHero(newHero2);
        assertFalse(bodyBuilder.getHeroesList().contains(newHero2));
    }
    @Test
    public void testIfRemoveHeroAllHeroesList(){
        Squad bodyBuilder = new Squad("bodyBuilders",1,"can fight");
        Hero newHero = new Hero("Dada",20,"Rocket Launcher","Speaking",bodyBuilder.getId());
        Hero newHero2 = new Hero("Mucyo",21,"sniper","Sleeping",bodyBuilder.getId());
        bodyBuilder.addHero(newHero);
        bodyBuilder.addHero(newHero2);
        bodyBuilder.removeHeroes();
        assertFalse(bodyBuilder.getHeroesList().contains(newHero2));
        assertFalse(bodyBuilder.getHeroesList().contains(newHero));
    }
    @Test
    public void testIfFindFunctionReturnASquad(){
        Squad bodyBuilder = new Squad("bodyBuilders",2,"can fight");
        assertEquals(bodyBuilder,Squad.find(1));
    }
    @Test
    public void testIfFindMethodReturnMoreThanOneHero(){
        Squad bodyBuilder = new Squad("bodyBuilders",4,"can fight");
        Squad bodyBuilder2 = new Squad("sniper",3,"can shoot");
        assertEquals(bodyBuilder,Squad.find(2));
   }

}
