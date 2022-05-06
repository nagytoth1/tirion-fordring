package progtech.entities;

public class HordeTownHall extends Building{
    private static HordeTownHall instance = null;

    private HordeTownHall(short hp, short buildCostGold, short buildCostWood, String displayName) {
        super(hp, buildCostGold, buildCostWood, displayName);
    }

    public static Building getInstance(short hp, short buildCostGold, short buildCostWood, String displayName) {
        if(instance != null) return instance;

        instance = new HordeTownHall(hp, buildCostGold, buildCostWood, displayName);
        return instance;
    }
}
