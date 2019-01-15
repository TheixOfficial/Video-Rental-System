package com.video.rental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionHandler {
	
	public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Bruger/eclipse-workspace/Databases/videoRentalSystem/videoRentalSystem.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
        return conn;
    }
	
}
