//Exercice : bibliothèque
//Créer une classe "Livre" avec les attributs suivants : titre, auteur, nombre de pages et estEmprunté (par défaut false)
//Ajouter un constructeur, des getters et des setters pour ces attributs
//Créer une méthode pour afficher les informations sur le livre et une autre pour changer l'état d'emprunt
//Créer une classe "Bibliothèque" avec un tableau de "Livre" et les méthodes suivantes :
//Ajouter un livre à la collection
//Supprimer un livre de la collection
//Afficher la liste de tous les livres
//Emprunter un livre (changer l'état d'emprunt à true)
//Retourner un livre (changer l'état d'emprunt à false)
//Utiliser la classe "Bibliothèque" pour créer une bibliothèque avec plusieurs livres et afficher la liste de tous les livres
//Emprunter et retournez un livre, puis affichez à nouveau la liste de tous les livres pour vérifier que l'état d'emprunt a bien été modifié


package org.example.exerciceBibilotheque;

//Créer une classe "Livre" avec les attributs suivants : titre, auteur, nombre de pages et estEmprunté (par défaut false)
public class Livre {
    private String titre;
    private String auteur;
    private int nombrePage;
    private boolean estEmprunte;

// Constucteur
    public Livre(String titre, String auteur, int nombrePage, boolean estEmprunte) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePage = nombrePage;
        this.estEmprunte = false;
    }

    // Setter et getter

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombrePage() {
        return nombrePage;
    }

    public void setNombrePage(int nombrePage) {
        this.nombrePage = nombrePage;
    }

    public boolean isEstEmprunte() {
        return estEmprunte;
    }

    // Methode pour changer l'état d'emprunt
    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;

    }

//Créer une méthode pour afficher les informations sur le livre

    @Override
    public String toString() {
        return "Livre{" +
                "titre ='" + titre + '\'' +
                ", auteur ='" + auteur + '\'' +
                ", nombrePag e=" + nombrePage +
                ", estEmprunte =" + estEmprunte +
                '.';}

 //Créer une méthode pour changer l'état d'emprunt

  public void changeStatus() {
        this.estEmprunte = !this.estEmprunte; // ! devant un booléen donne son opposé

    }
}


