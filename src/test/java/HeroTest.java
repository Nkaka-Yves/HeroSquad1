import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HeroTest {
    @After
    public void tearDown(){
        Hero.clearAll();
    }
    @Test
    public void testIfHeroInstancesAreCorrect(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("name",11,"boxing","fainting",squadTest.getId());
        assertTrue(heroTest instanceof Hero);
    }
    @Test
    public void testIfGetNameReturnStringYves(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        assertEquals("yves",heroTest.getName());
    }
    @Test
    public void testIfGetAgeReturnInterger11(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        assertEquals(11,heroTest.getAge());
    }
    @Test
    public void testIfGetSpecialPowerReturnStringBoxing(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        assertEquals("boxing",heroTest.getSpecialPower());
    }
    @Test
    public void testIfGetWeaknessReturnStringFainting(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        assertEquals("fainting",heroTest.getWeakness());
    }
    @Test
    public void testIfGetIdHaveUniqueInt(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        assertEquals(1,heroTest.getId());
    }
    @Test
    public void testIfGetSquadIdAssignEachHeroToItsCorrectSquadId(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        squadTest.addHero(heroTest);
        assertEquals(squadTest.getId(),heroTest.getSquadId());
    }
    @Test
    public void testIfInstancesContainsHeroObjectsCreated(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        Hero heroTest2 = new Hero("nkaka",13,"sniper","sleeping",squadTest.getId());
        assertTrue(Hero.getHeroList().contains(heroTest));
        assertTrue(Hero.getHeroList().contains(heroTest2));
    }
    @Test
    public void testIfGetHeroesReturnsAList(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        List<Hero> expectedOutput = new ArrayList<Hero>();
        expectedOutput.add(heroTest);
        assertEquals(expectedOutput.get(1),Hero.getHeroList());
    }
    @Test
    public void testIfFindsReturnsAnInstanceOfHero(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        assertEquals(heroTest,Hero.findHero(1));
    }
    @Test
    public void testIfFindReturnsCorrectHeroWhenMoreThanOneExists(){
        Squad squadTest = new Squad("awesome",2,"fighting");
        Hero heroTest = new Hero("yves",11,"boxing","fainting",squadTest.getId());
        Hero heroTest2 = new Hero("nkaka",13,"sniper","sleeping",squadTest.getId());
        assertEquals(heroTest,Hero.findHero(2));
    }
}
