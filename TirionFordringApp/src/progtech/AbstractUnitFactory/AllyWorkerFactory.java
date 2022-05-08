package progtech.AbstractUnitFactory;

import progtech.entities.AllyWorker;
import progtech.entities.HordeWarrior;
import progtech.entities.Unit;
import progtech.main.UtilHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllyWorkerFactory extends UnitFactory
{
    public AllyWorkerFactory() throws SQLException
    {
        super(UtilHelper.DBConnection.getDataFromTable("units", "A", "work"));
    }
    @Override
    public Unit CreateUnit() {
        if(unitDetails == null) return new AllyWorker();
        try {
            return new AllyWorker(
                    unitDetails.getShort("init_hp"),
                    unitDetails.getShort("init_cost"),
                    unitDetails.getString("disp_name"));
        } catch (SQLException e) {
            return new AllyWorker();
        }
    }
}
