package progtech.entities;

public abstract class Building
{
    private short hp;
    private short buildCostGold;
    private short buildCostWood;
    private String displayName;


    public Building( short hp, short buildCostGold, short buildCostWood, String displayName)
    {
            this.hp = hp;
            this.buildCostWood = buildCostWood;
            this.buildCostGold = buildCostGold;
            this.displayName = displayName;

    }

    public short getHp(){ return hp; }
    public short getBuildCostGold(){ return buildCostGold; }
    public short getBuildCostWood(){ return buildCostWood; }
    public String getDisplayName(){ return displayName; }
}
