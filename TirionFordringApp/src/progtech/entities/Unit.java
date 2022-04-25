package progtech.entities;

public abstract class Unit
{
    private byte Hp;
    private byte unitCost;
    private String displayName;
    public Unit(byte Hp, byte unitCost, String displayName)
    {
        this.Hp = Hp;
        this.unitCost = unitCost;
        this.displayName = displayName;
    }
}
