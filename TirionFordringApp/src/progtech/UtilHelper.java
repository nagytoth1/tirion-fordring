package progtech;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class UtilHelper {
    public static class Log
    {
        private static Logger logger;
        private static FileHandler fHandler;

        public static Logger initLogger(String path)
        {
            File f = new File(path);

            try
            {
                if(!f.exists()) f.createNewFile();
                fHandler = new FileHandler(path, true);
            } catch (IOException | SecurityException ex)
            {
                System.out.println(String.format("Logger error... %s", ex.getLocalizedMessage()));
            }
            
            logger = Logger.getLogger(Log.class.getName());
            logger.addHandler(fHandler);
            fHandler.setFormatter(new SimpleFormatter());
            
            logger.setLevel(Level.FINE);
            logger.fine("Logger has been initialized");
            return logger;
        }
    }
    
    public static class DBHandler
    {
        public static Connection initConnector(String url)
        {
            Logger l = Log.logger;
            Connection conn = null;
            try
            {
                conn = DriverManager.getConnection(url);
                l.setLevel(Level.FINE);
                l.fine("Program has been connected to SQL successfully!");
                return conn;
            } catch (SQLException e)
            {
                l.setLevel(Level.SEVERE);
                l.severe("Database connection failed to be established");
                return null;
            } finally
            {
                if(conn != null) try {
                    conn.close();
                } catch (SQLException ex) {
                    l.setLevel(Level.SEVERE);
                    l.severe("SQL-Connection failed to be closed");
                }
                
            }
        }
    }
}
