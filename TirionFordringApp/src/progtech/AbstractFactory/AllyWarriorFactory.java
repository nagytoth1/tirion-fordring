package progtech.AbstractFactory;

import progtech.entities.AllyWarriror;
import progtech.entities.Unit;

public class AllyWarriorFactory extends UnitFactory
{
    @Override
    public Unit CreateUnit()
    {
        return new AllyWarriror();
    }
}
