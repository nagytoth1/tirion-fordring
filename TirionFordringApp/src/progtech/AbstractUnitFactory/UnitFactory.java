package progtech.AbstractUnitFactory;

import progtech.entities.Player;
import progtech.entities.Unit;

import java.sql.Connection;
import java.sql.ResultSet;

public abstract class UnitFactory
{
    protected ResultSet unitDetails;

    public UnitFactory(ResultSet details){ this.unitDetails = details; }
    public abstract Unit CreateUnit();
}
