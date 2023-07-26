//Exercice : WaterTank
//1. Créer une classe WaterTank
//2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau deremplissage
//3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
//4. créer une méthode vider() qui enlèvera un volume d'eau à la citerne
//5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de laciterne
//6. le volume d'eau d'une citerne ne peut pas être négatif ou dépasser levolume maximum

package org.example.exercice3_watertank;

public class WaterTank {

    private double poids, capacite, niveau;
    public static double volume_total=0;


// Constructeur


    public WaterTank(double poids, double capacite, double niveau) {
        volume_total += niveau;;
        this.poids = poids;
        this.capacite = capacite;
        this.niveau = niveau;
        WaterTank.volume_total += niveau;

    }

//3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne

    public void remplir(double volume) {
        if(capacite + this.niveau<= capacite){
        this.niveau += volume;
        WaterTank.volume_total += niveau;}
    }


    //4. créer une méthode vider() qui enlèvera un volume d'eau à la citerne
    public void vider(double volume) {
        if (capacite < this.niveau) {
            this.niveau -= volume;
            WaterTank.volume_total -= niveau;

            //System.out.println("après la medode 'vider' le volume d'eau de la citerne est " + niveau);
        }
    }
// getter pour le poids total
        public double poidsTotal = poids + niveau;


        //getter et setter


        public double getPoids;

        public void setPoids (double poids){
            this.poids = poids;
        }

        public double getCapacite () {
            return capacite;
        }

        public void setCapacite ( double capacite){
            this.capacite = capacite;
        }

        public double getNiveau () {
            return niveau;
        }

        public void setNiveau ( double niveau){
            this.niveau = niveau;
        }

        @Override
        public String toString () {
            return "WaterTank{" +
                    "poids=" + poids +
                    ", capacite=" + capacite +
                    ", niveau=" + niveau +
                    '}';
        }
    }