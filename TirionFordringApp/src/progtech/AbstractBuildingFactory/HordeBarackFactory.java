package progtech.AbstractBuildingFactory;

import progtech.entities.*;
import progtech.main.UtilHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HordeBarackFactory extends BuildingFactory
{
    @Override
    public Building CreateBuilding(Player p, Connection conn) {
        if(p.getOwnedUnits().size() > 0) {
            ResultSet s;
            try {
                 s = UtilHelper.DBConnection.getDataFromTable(conn,"buildings","H", "bar");
                 return new HordeBarack(
                        s.getShort("init_hp"),
                        s.getShort("init_cost_gold"),
                        s.getShort("init_cost_wood"),
                        s.getString("type"));
            } catch (SQLException e) {
                return new HordeBarack((short) 200, (short) 50, (short) 50, "Barracks");
            }
        }
        else
        {
            return null;
        }
    }
}
