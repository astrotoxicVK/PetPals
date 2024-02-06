package com.util ;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBConn {
    private DBConn() {
       
    }

    public static String getPropertyString() {
        Properties properties = new Properties();
        String connectionString = null;

        try (FileInputStream input = new FileInputStream("db.properties")) {
      
            properties.load(input);

            connectionString = "jdbc:mysql://" +
                    properties.getProperty("hostname") +
                    ":" + properties.getProperty("port") +
                    "/" + properties.getProperty("dbname") +
                    "?user=" + properties.getProperty("username") +
                    "&password=" + properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace(); 
        }

        return connectionString;
    }
    
}
