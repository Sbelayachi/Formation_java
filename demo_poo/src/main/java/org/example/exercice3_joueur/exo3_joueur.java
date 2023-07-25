//Exercice : Joueur
//1.//Créer une classe Joueur
//2.//Ajouter les attributs suivants : nom, niveau et points d'expérience
//3.//Ajouter un constructeur, des getters et des setters pour ces attributs
//4.//Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérienceau joueur
//5.//Créer qu'une méthode qui augmente le niveau du joueur de +1 si sonexpérience dépasse 100 points et réinitialise son expérience
//6.//Tester le programme

package org.example.exercice3_joueur;

public class exo3_joueur {
    private String nom;
    private int niveau, points;

    public String getNom() {
        return nom;
    }



    //  getters - setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }



    // CONSTRUCTEUR
    public exo3_joueur(String nom, int niveau, int points) {
        this.nom = nom;
        this.niveau = niveau;
        this.points = points;

// 4.Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérienceau joueur

        public void Quete(int num) {
            this.points += 10;
            System.out.println(this.points + "effectue la quete !" + points);
        }
//5.//Créer qu'une méthode qui augmente le niveau du joueur de +1 si sonexpérience dépasse 100 points et réinitialise son expérience

        public void Quete(int num) {
            if (this.points >= 100) {
                this.niveau++;
                System.out.println("Votre " + this.niveau + " !");
                this.points = 0;
            }
        }



    }
    @Override
    public String toString() {
        return "exo3_joueur{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", points=" + points +
                '}';
    }
}

