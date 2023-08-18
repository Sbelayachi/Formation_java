package org.example.demojbdc;

import org.example.demojbdc.utils.DatabaseManager;

import java.sql.*;
import java.util.Scanner;

public class Demo1 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = DatabaseManager.getPostgreSQLConnection();
             System.out.println("Merci de saisir le prénom :");
             String firstname = scanner.nextLine();
             System.out.println("Merci de saisir le nom :");
             String lastname = scanner.nextLine();
             String requestSt = "INSERT INTO person (first_name, last_name) VALUES ('"+firstname+"','"+lastname+"')";

             // Facon 1 => execution de requete sans retour
            System.out.println("=== Méthode 1 ===");

             Statement statement = connection.createStatement();
             statement.execute(requestSt);

            boolean res = statement.execute(requestSt);
            if(res){
                System.out.println("Des données renvoyées par la requête");
            }else {
                System.out.println("Aucune données renvoyées par la requête");
            }



            // Facon 2 => avec une requête préparée
            System.out.println("=== Méthode 2 ===");


            String requestPrSt = "INSERT INTO person (first_name, last_name) VALUES ( ? , ? )";
            PreparedStatement preparedStatement = connection.prepareStatement(requestPrSt);
            preparedStatement.setString(1,firstname);
            preparedStatement.setString(2,lastname);
            //preparedStatement.execute(); // retour boolean
            int nbRows = preparedStatement.executeUpdate();
            System.out.println("Nombre ligne "+nbRows);



            // version avec recuperation de l'id auto genere
            System.out.println("=== Méthode 2 bis ===");


            PreparedStatement preparedStatementBis = connection.prepareStatement(requestPrSt, Statement.RETURN_GENERATED_KEYS);
            preparedStatementBis.setString(1,firstname);
            preparedStatementBis.setString(2,lastname);
            int nbRowsBis = preparedStatementBis.executeUpdate();
            ResultSet resultSet = preparedStatementBis.getGeneratedKeys();
            System.out.println("Nombre ligne "+nbRowsBis);
            if(resultSet.next()){
                System.out.println("ID : " + resultSet.getInt("id"));
            }



            // facon 3 => avec une requete de lecture
            System.out.println("=== Méthode 3 ===");

            String request = "SELECT * FROM person";
            Statement statementBis = connection.createStatement();
            ResultSet resultSetBis = statementBis.executeQuery(request);
            while(resultSetBis.next()){
                System.out.println(resultSetBis.getInt("id")+ " , "+ resultSetBis.getString("first_name")+
                        " , "+ resultSetBis.getString("last_name"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }


    }


}
