package progtech.AbstractFactory;

import progtech.entities.AllyWorker;
import progtech.entities.Unit;

public class AllyWorkerFactory extends UnitFactory
{

    @Override
    public Unit CreateUnit()
    {
        return new AllyWorker();
    }
}
