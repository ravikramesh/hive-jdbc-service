package com.ravi.hivesql;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

/**
 * Created by Ravikumar Ramasamy on 3/26/18 11:49 AM.
 */
public class HiveClient {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        // Register driver and create driver instance
        Class.forName(driverName);
        // get connection
        Connection con = DriverManager.getConnection(
                "jdbc:hive2://localhost:10000/default", args[0], args[1]);
        Statement stmt = con.createStatement();
        stmt.execute("CREATE DATABASE testing");
        System.out.println("Database testing created successwdbfully.");
        con.close();
    }
}


