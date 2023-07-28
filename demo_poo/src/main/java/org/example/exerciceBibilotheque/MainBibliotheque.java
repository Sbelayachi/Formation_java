package org.example.exerciceBibilotheque;

public class MainBibliotheque {
    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque();
        System.out.println("###########");

        bibliotheque.afficheAll();
        System.out.println("#####################");

        Livre livre1 = new Livre("le roi lion", "toto", 5, true);
        Livre livre2 = new Livre("martine", "toto", 5, true);
        Livre livre3 = new Livre("le roi ", "toto", 5, true);
        ;
        Livre livre4 = new Livre("titi", "toto", 5, true);
        ;
        Livre livre5 = new Livre("tutu", "toto", 5, true);
        ;


        bibliotheque.addLivre(livre1);
        bibliotheque.addLivre(livre2);
        bibliotheque.addLivre(livre3);
        bibliotheque.addLivre(livre4);
        bibliotheque.addLivre(livre5);
        bibliotheque.addLivre (new Livre("Titre 5","Auteur 5",123,false));

        bibliotheque.afficheAll();

        System.out.println("##################### Emprunt du livre 4");

        bibliotheque.empruntLivre(livre4);
        bibliotheque.afficheAll();

        System.out.println();
        System.out.println("##################### Rendre du livre 4");

        bibliotheque.rendreLivre(livre4);
        bibliotheque.afficheAll();
        System.out.println();
        System.out.println("##################### Suppression du livre 3");

        bibliotheque.removeLivre(livre3);
        bibliotheque.afficheAll();

        System.out.println("##################### emprunt du titre avec le livre 5\n");
        System.out.println(bibliotheque.empruntLivreParTitre("dfkjgdfgjhh\n"));
        System.out.println(bibliotheque.empruntLivreParTitre("Titre 5"));



    }
}










//        System.out.println("\nListe des livres après emprunt/retour:");
//        Bibliotheque.afficherListeLivres();
    //}
//}
