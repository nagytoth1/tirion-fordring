package progtech.AbstractUnitFactory;

import progtech.entities.AllyWarrior;
import progtech.entities.HordeWarrior;
import progtech.entities.Player;
import progtech.entities.Unit;
import progtech.main.UtilHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllyWarriorFactory extends UnitFactory
{
    @Override
    public Unit CreateUnit(Connection conn)
    {
        ResultSet s;
        try {
            s = UtilHelper.DBConnection.getDataFromTable(conn, "units", "A", "peasant");
            return new HordeWarrior(
                    s.getShort("init_hp"),
                    s.getShort("init_cost"),
                    s.getString("type"));
        } catch (SQLException e) {
            return new HordeWarrior();
        }
    }
}
