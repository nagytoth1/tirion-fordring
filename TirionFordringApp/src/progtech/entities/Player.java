package progtech.entities;

import java.util.ArrayList;
import java.util.List;
import progtech.observer.Observer;
import progtech.observer.Subject;

public class Player implements Subject{
    private byte DEF_UNIT_NUMBER; //hány egységet kap a játékos?
    private byte DEF_BUILDING_NUMBER; //hány épületet kap a játékos?
    private int currentGold; //jelenlegi aranymennyiség, ami a játékosnál van
    private int currentWood; //jelenlegi famennyiség, ami a játékosnál van
    private int sumGold; //amit a játékos már idáig elköltött
    private List<Building> ownedBuildings;
    private List<Unit> ownedUnits;
    private Observer achievementHandler; //ő fogja figyelni a játékos által elért eredményeket

    public Player()
    {
        this.currentGold = 300; this.currentWood = 300;
        this.sumGold = 0;
        ownedBuildings = new ArrayList<>(); //townhall-t alapból megkapja
        ownedUnits = new ArrayList<>(); //kaphatna 3 peon-t ingyen, viszont akkor ennyit le kell vonni az achievement miatt
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

    @Override
    public void notifyObserver()
    {
        this.achievementHandler.update(this);
    }

    public int getCurrentWood(){ return currentWood; }
    public void setCurrentWood(int currentWood){ this.currentWood = currentWood; }
    public int getSumGold(){ return sumGold; }
    public void setSumGold(int sumGold)
    {
        this.sumGold = sumGold;
        if(sumGold >= 500) fiveHundredGoldSpent();
    }
    
    public List<Building> getOwnedBuildings(){ return ownedBuildings; }
    public void setOwnedBuildings(List<Building> ownedBuildings){ 
        this.ownedBuildings = ownedBuildings; 
        if(ownedBuildings.size() - DEF_BUILDING_NUMBER >= 5) atLeastFiveBuildingsBuilt();
    }
    
    public List<Unit> getOwnedUnits(){ return ownedUnits; }
    
    public void setOwnedUnits(List<Unit> ownedUnits)
    {
        this.ownedUnits = ownedUnits;
        if(ownedUnits.size() - DEF_UNIT_NUMBER >= 5) atLeastFiveUnitsCreated();
    }

    //ki lesz az observer? maga a screen, ami a grafikus felületet adja, 
    //helyesebben az AchievementHandler: ő fogja kapni az infót, hogy a játékos mit ért el, ő fogja megjeleníteni a jobb felső sarokban pl. az achievementet
    private void fiveHundredGoldSpent()
    {
        notifyObserver(); //ez meghívja az update metódusát, magát az eseményt is át kéne adni, hogy mi váltotta ki
    }

    private void atLeastFiveBuildingsBuilt()
    {
        notifyObserver();
    }

    private void atLeastFiveUnitsCreated()
    {
        notifyObserver();
    }
    
    
    
}
