package progtech.entities;

public class AllyWorker extends Unit
{
    public AllyWorker()
    {
        this((byte)50,(byte)10,"Peasant");
    }
    public AllyWorker(short hp, short cost, String dispName){ super(hp, cost, dispName); }
}
