//1. Créer une classe Client possédant : un identifiant, un nom, un prénom et un numéro de téléphone


package org.example.ExerciceHotel;

public class Client {
    private int identifiant;
    private String nom;
    private String prenom;
    private String numeroTelephone;

// Constructeur


    public Client(int identifiant, String nom, String prenom, String numeroTelephone) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
    }

 // Setter et Getter

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
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

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    // ToString


    @Override
    public String toString() {
        return "Client{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTelephone='" + numeroTelephone + '\'' +
                '}';
    }
}
