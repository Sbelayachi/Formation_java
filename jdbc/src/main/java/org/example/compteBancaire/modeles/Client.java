package org.example.compteBancaire.modeles;

import java.util.List;

public class Client {


private int idClient;
private String nom;
private String prenom;
private List<CompteBancaire> comptes;

private String telephoneClient;

// Constructeur

    public Client(int idClient, String nom, String prenom) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.comptes = comptes;
        this.telephoneClient = telephoneClient;
    }


// Getter et setter

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public void setComptes(List<CompteBancaire> comptes) {
        this.comptes = comptes;
    }

    public String getTelephoneClient() {
        return telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }


    // to String


    @Override
    public String toString() {
        return "Client : " +
                "- \n idClient = " + idClient +
                "- \n nom = " + nom + '\'' +
                "- \n prenom = " + prenom + '\'' +
                "- \n comptes = " + comptes +
                "- \n Numero de Téléphone = " + telephoneClient  ;

    }
}
