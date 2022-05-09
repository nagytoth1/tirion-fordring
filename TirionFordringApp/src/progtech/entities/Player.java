package progtech.entities;

import java.util.ArrayList;
import java.util.List;

import progtech.observer.AchievementHandler;
import progtech.observer.Observer;
import progtech.observer.Subject;

public class Player implements Subject
{
    private byte DEF_UNIT_NUMBER; //hány egységet kap a játékos?
    private byte DEF_BUILDING_NUMBER; //hány épületet kap a játékos?
    private int currentGold; //jelenlegi aranymennyiség, ami a játékosnál van
    private int currentWood; //jelenlegi famennyiség, ami a játékosnál van
    private int sumGold; //amit a játékos már idáig elköltött
    private List<Building> ownedBuildings;
    private List<Unit> ownedUnits;
    private Observer achievementHandler; //ő fogja figyelni a játékos által elért eredményeket

    public Player(AchievementHandler achievementHandler)
    {
        this.currentGold = 300; //300 gold
        this.currentWood = 300; //300 fa
        this.sumGold = 0; //alapból 0 pénz
        ownedBuildings = new ArrayList<>(); //townhall-t alapból megkapja
        ownedUnits = new ArrayList<>(); //kaphatna 3 peon-t ingyen, viszont akkor ennyit le kell vonni az achievement miatt
        this.achievementHandler = achievementHandler;
    }

    @Override
    public void setObserver(Observer o)
    {
        if(this.achievementHandler != null) return; //már be van állítva
        this.achievementHandler = o;
    }

    @Override
    public void deleteObserver()
    {
        if(this.achievementHandler == null) return; //már ki lett kapcsolva
        this.achievementHandler = null;
    }



    public int getCurrentWood(){ return currentWood; }
    public void setCurrentWood(int currentWood) throws Exception {
        int maxWood = 800;
        if(currentWood >= maxWood) throw new Exception("Max wood reached");
        this.currentWood = currentWood;
    }
    public int getSumGold(){ return sumGold; }
    public void setSumGold(int sumGold)
    {
        this.sumGold = sumGold;
        if(sumGold >= 500) fiveHundredGoldSpent();
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public void decreaseCurrentGold(int value) throws Exception {
        //value itself can't be negative - ensure that it is unsigned
        if(value < 0) throw new Exception("Can't decrease by negative number!");
        //currentGold can't become negative
        if(value > currentGold) throw new Exception("Failed to decrease, MIN reached.");
        currentGold -= value;
    }

    //the more peon the player has, the more gold player earns
    public void increaseCurrentGold(int value, float multiplier) throws Exception{
        //2 gold * 1.5 = 3 gold per every 5 seconds
        int newCurrentGoldValue = Math.round(currentGold + value * multiplier);
        if(newCurrentGoldValue > 99999) //if the new value would exceed 99 999, stop
            throw new Exception("Failed to increment MAX reached.");
        if(value < 0 || multiplier < 0)
            throw new Exception("Can't increase by negative number!");
        if(multiplier > 2.5f)
        {
            throw new Exception("Can't increase gold with that much multiplier");
        }
        currentGold = newCurrentGoldValue;
    }

    public List<Building> getOwnedBuildings(){ return ownedBuildings; }

    public void addBuildings(Building building) throws Exception
    {
        if (ownedBuildings.size() >= 10)
        {
            throw new Exception("Can't increase the amount of buildings!");
        }
        if(ownedBuildings.size() >= 5)
        {
            atLeastFiveUnitsCreated();
        }
        ownedBuildings.add(building);
    }
    
    public List<Unit> getOwnedUnits(){ return ownedUnits; }
    
    public void addUnit(Unit unit) throws Exception {
        if (ownedUnits.size() >= 10)
        {
            throw new Exception("Can't increase the amount of units!");
        }
        if(ownedUnits.size() == 5)
        {
            atLeastFiveUnitsCreated();
        }
        ownedUnits.add(unit);
    }
    private void fiveHundredGoldSpent()
    {
        notifyObservers("You have spent 500 gold.");
    }

    private void atLeastFiveBuildingsBuilt()
    {
        notifyObservers("You have built at least five buildings.");
    }

    private void atLeastFiveUnitsCreated()
    {
        notifyObservers("You have recruited at least five units.");
    }

    @Override
    public void notifyObservers(String message)
    {
        this.achievementHandler.update(message);
    }

    public void setCurrentGold(int value)
    {
        currentGold = value;
    }
}
