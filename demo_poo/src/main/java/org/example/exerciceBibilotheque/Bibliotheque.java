package org.example.exerciceBibilotheque;

public class Bibliotheque {


    private Livre[] collection;
private int tailleMaxi;
private int nombreLivres;

    public Bibliotheque(Livre[] collection, int tailleMaxi, int nombreLivres) {
        this.collection = collection;
        this.tailleMaxi = tailleMaxi;
        this.nombreLivres = nombreLivres;}
    public Bibliothèque(int tailleMaxi) {
        collection = new Livre[tailleMaxi];
    }


    public void ajouterLivre(Livre livre) {
        if (nombreLivres < tailleMaxi) {
            collection[nombreLivres] = livre;
            nombreLivres++;
        } else {
            System.out.println("La bibliothèque est pleine, impossible d'ajouter un nouveau livre.");
        }
    }
        public void supprimerLivre(Livre livre) {
            int index = -1;
            for (int i = 0; i < nombreLivres; i++) {
                if (collection[i] == livre) {
                    index = i;
                    break;
                }
            }
        }
            public void afficherListeLivres() {
                System.out.println("Liste des livres dans la bibliothèque:");
                for (Livre livre : collection) {
                    if (livre != null) {
                   collection[livre].afficherListeLivres;
                                System.out.println();
                    }
                }
            }

            public void emprunterLivre(Livre livre) {
                livre.setEstEmprunte(true);
            }
            public void retournerLivre(Livre livre) {
                livre.setEstEmprunte(false);
            }

//        public void afficherListeLivres(Livre Livre) {
//            System.out.println("Liste des livres dans la bibliothèque:");
//            for (int i = 0; i < nombreLivres; i++) {
//                collection[i].afficherInformations();
//                System.out.println("-------------------------");
//            }
//        }
//
//        public void emprunterLivre(Livre livre) {
//            livre.setEstEmprunte (true);
//        }
//
//
//        public void retournerLivre(Livre livre) {
//            livre.setEstEmprunte(false);
        }

    }


}


