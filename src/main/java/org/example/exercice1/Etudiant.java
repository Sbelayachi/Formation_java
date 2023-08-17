package org.example.exercice1;

import org.example.demojbdc.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Etudiant {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = DatabaseManager.getPostgreSQLConnection();


            // - Réalisez une application en java qui demande à l'utilisateur de saisir : nom /prenom / num de classe  et date de diplome
            System.out.println("===> SAISIR LES DONNEES CONCERNANT L'ETUDIANT  \n");

            System.out.println("Saisir le nom :");
            String nom = scanner.nextLine();
            System.out.println("Saisir le prénom :");
            String prenom = scanner.nextLine();
            System.out.println("Saisir le numéro de classe :");
            int numero_classe = scanner.nextInt();
            System.out.println("Saisir la Date de diplôme :");
            String date_diplome = scanner.nextLine();
            String requestSt = "INSERT INTO person (first_name, last_name) VALUES ('" + nom + "','" + prenom + "')" + numero_classe + "')" + date_diplome + "')";

//  ==========================================================================================================

            // Ajouter dans la BDD (exerciceJBDC)

            String query = "INSERT INTO student (nom, prenom, numero_classe, date_diplome) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, nom);
            statement.setString(2, prenom);
            statement.setInt(3, numero_classe);
            statement.setString(4, date_diplome);

            int rows = statement.executeUpdate();
            if (rows == 0) {
                System.out.println("Erreur : l'étudiant n'a pas été ajouté à la base de données");
            } else {
                System.out.println("Ajout de " + rows + " étudiant dans la base de données");
            }















        } catch (SQLException e) {
            System.out.println("Connexion BDD échouée");
            e.printStackTrace();
        }  finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}