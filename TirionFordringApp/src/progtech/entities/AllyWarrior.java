package progtech.entities;

public class AllyWarrior extends Unit
{

    public AllyWarrior()
    {
        this((byte)100,(byte)30,"Footman");
    }
    public AllyWarrior(short hp, short cost, String dispName){ super(hp, cost, dispName);}
}
