package progtech.AbstractUnitFactory;

import progtech.entities.Player;
import progtech.entities.Unit;

import java.sql.Connection;

public abstract class UnitFactory
{
    public abstract Unit CreateUnit(Connection conn);
}
