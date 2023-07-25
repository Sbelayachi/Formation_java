package org.example.exercice1_chaise;

public class Chaise {

    public int nb_pieds;
    public String materiaux, couleur;

    public Double prix;

    public Chaise(int nb_pieds, String materiaux, String couleur, Double prix) {
        this.nb_pieds = nb_pieds;
        this.materiaux = materiaux;
        this.couleur = couleur;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Je suis une Chaise avec "
                + nb_pieds +"pied(s) en chaine de couleur "
                + couleur + " et à un prix de " + prix ;
    }
}