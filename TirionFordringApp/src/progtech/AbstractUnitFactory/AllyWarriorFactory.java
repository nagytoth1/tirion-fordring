package progtech.AbstractUnitFactory;

import progtech.entities.AllyWarrior;
import progtech.entities.Unit;

public class AllyWarriorFactory extends UnitFactory
{
    @Override
    public Unit CreateUnit()
    {
        return new AllyWarrior();
    }
}
