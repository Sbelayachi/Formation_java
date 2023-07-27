package org.example.exerciceBibilotheque;

public class MainBibliotheque {
    public static void main(String[] args) {

        Bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("le roi lion","toto",5,true);
        Livre livre2 = new Livre("martine","toto",5,true);
        Livre livre3 = new Livre("le roi lion","toto",5,true);;


        Bibliotheque.ajouterLivre(livre1,livre2);
        Bibliotheque.ajouterLivre(livre2,livre3);
        Bibliotheque.ajouterLivre(livre3,livre1);


        System.out.println("Liste des livres avant emprunt/retour:");
        Bibliotheque.afficherListeLivres();

        Bibliotheque.emprunterLivre(livre2);
        Bibliotheque.retournerLivre(livre1);

        System.out.println("\nListe des livres après emprunt/retour:");
        Bibliotheque.afficherListeLivres();
    }
}
