package progtech.entities;

public abstract class Unit
{
    private short hp;
    private short unitCost;
    private String displayName;
    
    public Unit(short hp, short unitCost, String displayName)
    {
        this.hp = hp;
        this.unitCost = unitCost;
        this.displayName = displayName;
    }
    
    public short getHp(){ return hp; }
    public short getUnitCost(){ return unitCost; }
    public String getDisplayName(){ return displayName; }
}
