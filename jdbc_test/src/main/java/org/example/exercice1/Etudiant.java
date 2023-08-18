package org.example.exercice1;

import org.example.demojbdc.utils.DatabaseManager;

import java.sql.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class  Etudiant {

    private int idStudent;
    private String name;
    private String lastname;
    private int numeroClasse;
    private Date dateDiplome;
    Scanner scanner = new Scanner(System.in);
    Connection connection = null;


    // CONSTRUCTOR 1

    public Etudiant(String name, String lastname, int numeroClasse, Date dateDiplome) {
        this.name = name;
        this.lastname = lastname;
        this.numeroClasse = numeroClasse;
        this.dateDiplome = dateDiplome;
    }

    // CONSTRUCTOR 2

    public Etudiant(int id, String name, String lastname, int numeroClasse, Date dateDiplome) {
        this(name,lastname,numeroClasse,dateDiplome);
        this.idStudent = idStudent;
    }


    // Getter Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumeroClasse() {
        return numeroClasse;
    }

    public void setNumeroClasse(int numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    public Date getDateDiplome() {
        return dateDiplome;
    }

    public void setDateDiplome(Date dateDiplome) {
        this.dateDiplome = dateDiplome;
    }

// toString

    @Override
    public String toString() {
        return "Etudiant{" +
                "Id='" + idStudent + '\'' +
                "name='" + name + '\'' +
                ", firstname='" + lastname + '\'' +
                ", numeroClasse=" + numeroClasse +
                ", dateDiplome='" + dateDiplome + '\'' +
                '}';
    }

    // Autres méthodes

    // 1- Sauvegarder Etudiant
    public void saveStudent() {
        try {
            connection = DatabaseManager.getPostgreSQLConnection();


            // - Réalisez une application en java qui demande à l'utilisateur de saisir : nom /prenom / num de classe  et date de diplome

            System.out.println("===> SAISIR LES DONNEES CONCERNANT L'ETUDIANT  \n");

            System.out.println("Saisir le nom :");
            name = scanner.nextLine();
            System.out.println("Saisir le prénom :");
            lastname = scanner.nextLine();
            System.out.println("Saisir le numéro de classe :");
            numeroClasse = scanner.nextInt();
            System.out.println("Saisir la Date de diplôme : AA-MM-YY");
//            dateDiplome = scanner.next();

//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//            LocalDate degreeDate = LocalDate.parse(date_diplome, formatter);


//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
//            Date diplomaDate = simpleDateFormat.parse(dateDiplome);

            String query = "INSERT INTO student (last_name, first_name, class_number, diploma_date) VALUES (?,?,?,?)";


            // 1- Enregistrer Etudiant
////
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, getName());
            statement.setString(2, getLastname());
            statement.setInt(3, getNumeroClasse());
            statement.setDate(4, new java.sql.Date(getDateDiplome().getTime()));

            int rows = statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();

            if (rows == 0) {
                System.out.println("ATTENTION => l'étudiant n'a pas été ajouté à la base de données !!! ");
            } else {
                System.out.println("L'étudiant  " + rows + " été a  ajouté à la base de données");
            }

        } catch (SQLException e) {
            System.out.println("la Connexion à la BDD a échoué");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


        // 1- get all student

//
    }
}

//}


//
//
////
////
////
////
////
////
//////  ==========================================================================================================
////

////
////
////
////
////
////
////
////
////
////
////
////
////
////
////// Levée des exceptions
////
////        } catch (SQLException e) {
////            System.out.println("la Connexion à la BDD a échoué");
////            e.printStackTrace();
////        } finally {
////            if (connection != null) {
////                try {
////                    connection.close();
////                } catch (SQLException e) {
////                    e.printStackTrace();
////                }
////            }
////        }
//
