package progtech.AbstractUnitFactory;

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
