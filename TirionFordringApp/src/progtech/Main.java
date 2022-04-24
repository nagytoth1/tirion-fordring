package progtech;

import java.sql.Connection;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        
        Logger l = UtilHelper.Log.initLogger();
        Connection conn = UtilHelper.DBConnection.initConnector();
    }

}
