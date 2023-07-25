// Exercice 2  : Film SLIDE 22
//1.//Créer une classe "Film"
//2.//Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
//3.//Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi qu'une méthode pour afficher les informations sur le film


package org.example.exercice2_film;

public class Exo2_film {
    private String titre, realisateur, annee_sortie, genre;


    @Override
    public String toString() {
        return "exo2_film - Film " +titre +" , " + realisateur +" , "+ annee_sortie +" , " +genre;

    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getAnnee_sortie() {
        return annee_sortie;
    }

    public void setAnnee_sortie(String annee_sortie) {
        this.annee_sortie = annee_sortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Exo2_film(String titre, String realisateur, String annee_sortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.annee_sortie = annee_sortie;
        this.genre = genre;



    }
}
