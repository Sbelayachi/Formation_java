package org.example.exerciceBibilotheque;

import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<Livre> collection; // ou private List<Livre> livres;


    public Bibliotheque() {
        collection = new ArrayList<>();
    }

    public void addLivre(Livre livre) {
        collection.add(livre);
    }

    public void removeLivre(Livre livre) {
        collection.remove(livre);
    }

    public void afficheAll() {
        for (Livre l : collection) {
            System.out.println(l.toString());
        }
    }

    public void empruntLivre(Livre livre) {
        if (livre.isEstEmprunte() == false) { // simplifiable par if (!livre.isEstEmprunte())
            livre.changeStatus();
        }
    }

    public void rendreLivre(Livre livre) {
        if (livre.isEstEmprunte()) {
            livre.changeStatus();
        }
    }


    //Méthode emprunt livre par titre
    public String empruntLivreParTitre(String titre) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getTitre().equals(titre)) {
                collection.get(i).changeStatus();
                return "livre " + collection.get(i).getTitre() + "emprunté"; ///après une return dans une méthode la méthode est arrêtée : le code après n'est pas effectuée => fin de la boucle
            }
        }
        return "le livre " + titre + " n'est pas dans la biblio";
//            return null;
    }
}


//
//private int tailleMaxi;
//private int nombreLivres;
//
//    public Bibliotheque(Livre[] collection, int tailleMaxi, int nombreLivres) {
//        this.collection = collection;
//        this.tailleMaxi = tailleMaxi;
//        this.nombreLivres = nombreLivres;}
//    public Bibliothèque(int tailleMaxi) {
//        collection = new Livre[tailleMaxi];
//    }
//
//
//    public void ajouterLivre(Livre livre) {
//        if (nombreLivres < tailleMaxi) {
//            collection[nombreLivres] = livre;
//            nombreLivres++;
//        } else {
//            System.out.println("La bibliothèque est pleine, impossible d'ajouter un nouveau livre.");
//        }
//    }
//        public void supprimerLivre(Livre livre) {
//            int index = -1;
//            for (int i = 0; i < nombreLivres; i++) {
//                if (collection[i] == livre) {
//                    index = i;
//                    break;
//                }
//            }
//            public void afficherListeLivres() {
//                System.out.println("Liste des livres dans la bibliothèque:");
//                for (Livre livre : collection) {
//                    if (livre != null) {
//                   collection[].afficherListeLivres;
//                                System.out.println();
//                    }
//                }
//            }
//
//            public void emprunterLivre(Livre livre) {
//                livre.setEstEmprunte(true);
//            }
//            public void retournerLivre(Livre livre) {
//                livre.setEstEmprunte(false);
//            }
//
////        public void afficherListeLivres(Livre Livre) {
////            System.out.println("Liste des livres dans la bibliothèque:");
////            for (int i = 0; i < nombreLivres; i++) {
////                collection[i].afficherInformations();
////                System.out.println("-------------------------");
////            }
////        }
////
////        public void emprunterLivre(Livre livre) {
////            livre.setEstEmprunte (true);
////        }
////
////        public void retournerLivre(Livre livre) {
////            livre.setEstEmprunte(false);
//        }
//
//    }
//
//
//}
//
//
