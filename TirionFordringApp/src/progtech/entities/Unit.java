package progtech.entities;

public abstract class Unit
{
    private byte hp;
    private byte unitCost;
    private String displayName;
    
    public Unit(byte hp, byte unitCost, String displayName)
    {
        this.hp = hp;
        this.unitCost = unitCost;
        this.displayName = displayName;
    }
    
    public byte getHp(){ return hp; }
    public byte getUnitCost(){ return unitCost; }
    public String getDisplayName(){ return displayName; }
}
