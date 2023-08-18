package org.example.exercice1.DatabaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static final String dbUrl = "jdbc:postgresql://localhost:5432/jdbc_exo1";
    private static final String user = "postgres";
    private static final String password = "Storm";

    public static Connection getPostgreConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, user, password);

    }
}