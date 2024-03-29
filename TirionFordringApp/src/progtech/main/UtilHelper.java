package progtech.main;

import progtech.main.CustomFormatter;

import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.util.logging.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UtilHelper {
    /**
     * This class provides the appropriate logging service into a specific, predefined file.
     * By default the file path is: logging/log.txt
     */
    public static class Log
    {
        //has to be static final -> Garbage Collector can not free it
        private static final Logger logger = Logger.getLogger(Log.class.getName());

        /**
         * The function which allows for the logging process to get started properly.
         * @return The logger instance which handles the logging functionality in connection with log.txt.
         */
        public static Logger initLogger()
        {
            String logFilePath = Configurations.get("LOG_PATH");
            
            FileHandler fHandler;
            File f = new File(logFilePath);
            try
            {
                //since the config file itself may be missing at this point in the code, hereby I'm defining the path leading to log.txt manually.
                //Default path: logging/log.txt
                if(logFilePath.equals("undefined")) logFilePath = "logging\\log.txt"; //we need logger functionality
                
                if(!f.exists()) f.createNewFile();
                
                fHandler = new FileHandler(logFilePath, true);
                logger.addHandler(fHandler);
                fHandler.setFormatter(new CustomFormatter());
            } catch (IOException | SecurityException ex)
            {
                System.out.printf("Logger error... %s\n", ex.getLocalizedMessage());
            }
            
            logger.setLevel(Level.FINE);
            logger.fine("Logger has been initialized");
            return logger;
        }
    }
    
    public static class DBConnection
    {
        public static Connection dbConnection = null;
        /**
         * The method which allows for the database connection to be established properly.
         * @return A Connection-instance allowing us to execute SQL-commands within our Java-implementation.
         */
        public static Connection initConnector()
        {
            Logger l = Log.logger;
            String dbFilePath = Configurations.get("DB_PATH");
            
            try
            {
                if(dbFilePath.equals("undefined")) throw new SQLException();
                dbConnection = DriverManager.getConnection(
                        String.format("jdbc:sqlite:%s", 
                                dbFilePath)
                );
                l.setLevel(Level.FINE);
                l.fine("Program has been connected to SQL successfully!");
                return dbConnection;
            } catch (SQLException e)
            {
                l.setLevel(Level.WARNING);
                l.warning("Database connection failed to be established");
                return null;
            }
        }

        public static ResultSet getDataFromTable(String tablename, String factionCriteria, String typeCriteria) throws SQLException {
            if(dbConnection == null)
            {
                Log.logger.setLevel(Level.WARNING);
                Log.logger.warning("No database connected");
                return null;
            }
            Statement st = dbConnection.createStatement();
            String sql = String.format("SELECT * FROM %s WHERE faction='%s'", tablename, factionCriteria)  + " AND type LIKE '%"  + typeCriteria + "%';";
            Log.logger.setLevel(Level.FINE);
            Log.logger.fine(sql);
            return st.executeQuery(sql);
        }
    }
    
    public static class Configurations
    {
        private static final Properties prop = new Properties();
        private static final Logger l = Log.logger;
        public static String get(String configTag)
        {
            try
            {
                prop.load(new FileReader(new File("config.properties")));
                return prop.getProperty(configTag, "undefined");
            } 
            catch(FileNotFoundException f)
            {
                l.setLevel(Level.WARNING);
                l.warning("Config file could not be found.");
            }
            catch (IOException ex)
            {
                l.setLevel(Level.WARNING);
                l.warning("Config file could not be opened");
            }
            return "undefined";
        }
    }
}
