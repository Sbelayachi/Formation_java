package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


// ===> test de connexion à la BDD

        String url = "jdbc:postgresql://localhost:5432/exerciceJDBC";
        String user = "postgres";
        String password = "ed58yviv";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("La connexion est ok");
            } else {
                System.out.println("connexion echoué");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
    }
}