package progtech.entities;

import progtech.main.UtilHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AllyBarack extends Building
{

    public AllyBarack(short hp, short gold, short wood, String dispname) {
        super(hp, gold, wood, dispname);
    }
    public AllyBarack(){ super((short)300, (byte) 20,(byte)10,"Human Barrack"); }
}
