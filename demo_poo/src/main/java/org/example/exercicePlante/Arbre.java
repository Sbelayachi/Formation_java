package org.example.exercicePlante;

public class Arbre extends Plantes {
    public Arbre(String nom, Double hauteur, String couleur) {
        super(nom, hauteur, couleur);
    }

    private double circonference;

    @Override
    public void afficher() {
        super.toString();
      System.out.println("Informations à propos de l'arbre" + circonference);

    }
}
