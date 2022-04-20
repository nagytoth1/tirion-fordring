package progtech;

import java.sql.Connection;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        Logger l = UtilHelper.Log.initLogger("logging\\log.txt");
        Connection conn = UtilHelper.DBHandler.initConnector("jdbc:sqlite:..\\local_db\\database_management.db");
    }

}
