package progtech.entities;

public class AllyTownHall extends Building{
    private static AllyTownHall instance = null;
    private AllyTownHall(short hp, short buildCostGold, short buildCostWood, String displayName) {
        super(hp, buildCostGold, buildCostWood, displayName);
    }

    public static AllyTownHall getInstance(short hp, short buildCostGold, short buildCostWood, String displayName)
    {
        if(instance != null) return instance;

        instance = new AllyTownHall(hp, buildCostGold,buildCostWood, displayName);
        return instance;
    }
}
