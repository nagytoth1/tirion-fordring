package progtech.entities;

public class HordeWorker extends Unit
{

    public HordeWorker(){ this((byte)50,(byte)10,"Peon"); }
    public HordeWorker(short hp, short cost, String dispName){ super(hp, cost, dispName);}
}
