package progtech.test;

import progtech.AbstractBuildingFactory.AllyTownHallFactory;
import progtech.entities.*;
import progtech.observer.AchievementHandler;

import javax.swing.*;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    //the test instance of the class whose method we are testing
    private static final Player p = new Player(new AchievementHandler(new JLabel("")));

    @org.junit.jupiter.api.Test
    void setCurrentWood8000() {
        assertThrows(Exception.class, () -> p.setCurrentWood(8000));
    }

    @org.junit.jupiter.api.Test
    void setCurrentWood500() throws Exception {
        int expectedWood = 500;
        p.setCurrentWood(expectedWood);
        assertEquals(expectedWood, p.getCurrentWood());
    }

    @org.junit.jupiter.api.Test
    void setSumGold501()  //Gold 500 fölött van és vizsgálat -> label text-jét vizsgáljuk
    {
        AchievementHandler handler = (AchievementHandler) p.getAchievementHandler();
        int actualGold = 501;

        p.setSumGold(actualGold);

        String expected = "You have spent 500 gold.";

        assertEquals(expected,handler.getComponent().getText());

        //ensure that if gold is set above 500, fiveHundredGoldsSpent is called()
    }

    @org.junit.jupiter.api.Test
    void setSumGold400() {
        int expectedGold = 400;

        p.setSumGold(expectedGold);

        assertEquals(expectedGold, p.getSumGold());
    }

    @org.junit.jupiter.api.Test
    public void decreaseCurrentGoldByNegative(){
        assertThrows(Exception.class,
                () -> p.decreaseCurrentGold(-5),
                "Can't decrease by negative number!");
    }

    @org.junit.jupiter.api.Test
    public void decreaseCurrentGoldToNegative(){
        int baseValue = 500, decrementValue = 501;

        p.setCurrentGold(baseValue); //ensure that baseValue < decrementValue

        assertThrows(Exception.class,
                () -> p.decreaseCurrentGold(decrementValue),
                "Failed to decrease, MIN reached.");
    }

    @org.junit.jupiter.api.Test
    public void decreaseCurrentGoldByPositive() throws Exception {
        int baseValue = 500, decrementValue = 50;

        p.setCurrentGold(baseValue);

        int expected = baseValue - decrementValue;

        p.decreaseCurrentGold(decrementValue);

        assertEquals(
                expected,
                p.getCurrentGold());
    }

    @org.junit.jupiter.api.Test
    public void increaseCurrentGoldByPositive() throws Exception{
        //2 gold * 1.5 = 3 gold per every 5 seconds
        int baseValue = 500, incrementValue = 3;
        float multiplier = 1.1f;

        //Expected operation: 500 + 3 * 1.1
        int expected = Math.round(baseValue + incrementValue * multiplier);

        p.setCurrentGold(baseValue); //ensure that the base is 500
        //Calling the method: 500 + 3 * 1.1
        p.increaseCurrentGold(incrementValue, multiplier); //increment it with value multiplied by the multiplier

        //ensure that both are equal
        assertEquals(expected, p.getCurrentGold());
    }

    @org.junit.jupiter.api.Test
    public void increaseCurrentGoldByOneNegative(){
        assertThrows(Exception.class,
                () -> p.increaseCurrentGold(-5, 1.1f),
                "Can't increase by negative number!");
    }

    @org.junit.jupiter.api.Test
    public void increaseCurrentGoldByTwoNegatives() {
        assertThrows(Exception.class,
                () -> p.increaseCurrentGold(-5, -1.1f),
                "Can't increase by negative number!");
    }

    @org.junit.jupiter.api.Test
    public void increaseCurrentGoldWithHighModifier() {
        assertThrows(Exception.class,
                () -> p.increaseCurrentGold(-5, 15.6f),
                "Can't increase gold with that much multiplier");
    }

    @org.junit.jupiter.api.Test
    void addUnit()
    {
        for (int i = 0; i<10; i++)
        {
            try
            {
                p.addUnit(new HordeWorker());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        assertThrows(Exception.class,
            () -> p.addUnit(new HordeWorker()),
            "Can't increase the amount of units!");
    }

    @org.junit.jupiter.api.Test
    void addBuildings()
    {
        for (int i = 0; i<10; i++)
        {
            try
            {
                p.addBuildings(new HordeBarack());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        assertThrows(Exception.class,
                () -> p.addBuildings(new HordeBarack()),
                "Can't increase the amount of buildings!");
    }
}