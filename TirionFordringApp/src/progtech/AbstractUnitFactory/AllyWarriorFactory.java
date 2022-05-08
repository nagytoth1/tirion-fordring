package progtech.AbstractUnitFactory;

import progtech.entities.*;
import progtech.main.UtilHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllyWarriorFactory extends UnitFactory
{
    public AllyWarriorFactory() throws SQLException
    {
        super(UtilHelper.DBConnection.getDataFromTable("units", "A", "war"));
    }
    @Override
    public Unit CreateUnit()
    {
        if(unitDetails == null) return new AllyWarrior();
        try {
            return new AllyWarrior(
                    unitDetails.getShort("init_hp"),
                    unitDetails.getShort("init_cost"),
                    unitDetails.getString("disp_name"));
        } catch (SQLException e) {
            return new AllyWarrior();
        }
    }
}
