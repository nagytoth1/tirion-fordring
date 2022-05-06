package progtech.entities;

public class HordeWarrior extends Unit
{
    public HordeWarrior(){ this((short)100,(short)20,"Grunt"); }
    public HordeWarrior(short hp, short unitCost, String displayName){super(hp, unitCost, displayName);}
}
