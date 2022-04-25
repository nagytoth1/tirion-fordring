package progtech.AbstractFactory;

import progtech.entities.HordeWarrior;
import progtech.entities.Unit;

public class HordeWarriorFactory extends UnitFactory
{

    @Override
    public Unit CreateUnit()
    {
        return new HordeWarrior();
    }
}
