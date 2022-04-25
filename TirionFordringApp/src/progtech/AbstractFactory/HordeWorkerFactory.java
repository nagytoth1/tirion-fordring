package progtech.AbstractFactory;

import progtech.entities.HordeWorker;
import progtech.entities.Unit;

public class HordeWorkerFactory extends UnitFactory
{


    @Override
    public Unit CreateUnit()
    {
        return new HordeWorker();
    }
}
