package org.example.demoStatique;

public class Maison {
    private String couleur;
    private int nombrePorte;
    private double largeur;
    private double longeur;

    // Attributs de classes : commun à toute les instances

    //  <visibilité> static <type> <nom>
    // si il est en public <classe>.attribut>

    private static int nombreMaisons;
    public static String nomLatin = "Domus";


    public Maison(String couleur, int nombrePorte, double largeur, double longeur) {
        // ajouter un compteur de nb de maison
        nombreMaisons++;
        this.couleur = couleur;
        this.nombrePorte = nombrePorte;
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public String getCouleur() {
        return couleur;
    }
 // on peut changer les paramètres
    public void setCouleur(String couleur) {
        if (couleur != "orange"){
        this.couleur = couleur;}
    }

    public int getNombrePorte() {
        return nombrePorte;
    }

    public void setNombrePorte(int nombrePorte) {
        this.nombrePorte = nombrePorte;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    //// <visibilité> static <type> get<attibut>() return <attribut>
    public static int getNombreMaisons() {
        return nombreMaisons;
    }

    public static void setNombreMaisons(int nombreMaisons) {
        Maison.nombreMaisons = nombreMaisons;
    }

    public static String getNomLatin() {
        return nomLatin;
    }

    public static void setNomLatin(String nomLatin) {
        Maison.nomLatin = nomLatin;
    }
}


