package progtech.entities;

public abstract class Building
{
    private short hp;
    private byte buildCostGold;
    private byte buildCostWood;
    private String displayName;


    public Building( short hp, byte buildCostGold,byte buildCostWood, String displayName)
    {

            this.hp = hp;
            this.buildCostWood = buildCostWood;
            this.buildCostGold = buildCostGold;
            this.displayName = displayName;

    }

    public short getHp(){ return hp; }
    public byte getBuildCostGold(){ return buildCostGold; }
    public byte getBuildCostWood(){ return buildCostWood; }
    public String getDisplayName(){ return displayName; }
}
