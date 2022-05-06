package progtech.entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HordeBarack extends Building
{

    public HordeBarack(short hp, short gold, short wood, String dispname) {
        super(hp, gold, wood, dispname);
    }
    public HordeBarack(){ this((short)300, (short) 20,(short)10,"Orc Barrack");}
}
