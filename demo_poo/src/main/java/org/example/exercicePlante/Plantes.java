//Exercice : Plante
// 1.Créer une classe "Plante" avec les attributs suivants : nom, hauteur et couleur des feuilles
// 2.Ajouter un constructeur, des getters et des setters pour ces attributs
// 3.Créer une méthode pour afficher les informations sur la plante
// 4.Créer une classe "Arbre" qui hérite de "Plante" et qui ajoute un attributsupplémentaire pour la circonférence du tronc
// 5.Surcharger la méthode afficher pour qu'elle ajoute les informations àpropos de l'arbre




package org.example.exercicePlante;

public class Plantes {// 1.Créer une classe "Plante" avec les attributs suivants : nom, hauteur et couleur des feuilles
    private String nom;
    private Double hauteur;
    private String couleur;


    // CONSTRUCTEUR

    public Plantes(String nom, Double hauteur, String couleur) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleur = couleur;
    }
// 2.Ajouter un constructeur, des getters et des setters pour ces attributs

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getHauteur() {
        return hauteur;
    }

    public void setHauteur(Double hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // 3.Créer une méthode pour afficher les informations sur la plante
   // @Override
    public void afficher() {
        System.out.println("Plantes{" +
                "nom='" + nom + '\'' +
                ", hauteur=" + hauteur +
                ", couleur='" + couleur + '\'' +
                '}');
    }







    }


