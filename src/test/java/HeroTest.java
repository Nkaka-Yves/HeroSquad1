import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HeroTest {
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


}
