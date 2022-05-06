package progtech.AbstractBuildingFactory;

import progtech.entities.Building;
import progtech.entities.HordeTownHall;
import progtech.entities.Player;
import progtech.main.UtilHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HordeTownHallFactory extends BuildingFactory{
    @Override
    public Building CreateBuilding(Player p, Connection conn) {
        ResultSet s;
        try {
            s = UtilHelper.DBConnection.getDataFromTable(conn, "buildings", "A", "hall");
            return HordeTownHall.getInstance(
                    s.getShort("init_hp"),
                    s.getShort("init_cost_gold"),
                    s.getShort("init_cost_wood"),
                    s.getString("type"));
        } catch (SQLException e) {
            return HordeTownHall.getInstance((short) 200, (short) 50, (short) 50, "Town Hall");
        }
    }
}
