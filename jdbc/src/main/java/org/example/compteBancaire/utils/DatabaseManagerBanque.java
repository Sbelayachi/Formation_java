package org.example.compteBancaire.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManagerBanque {


    private static final String URI = "jdbc:postgresql://localhost:5432/Exercice_CompteBancaire" ;
    private static final String USER = "postgres" ;
    private static final String PASSWORD = "ed58yviv" ;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URI, USER, PASSWORD);
    }
}