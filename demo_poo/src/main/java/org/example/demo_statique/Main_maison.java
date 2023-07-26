package org.example.demo_statique;

public class Main_maison {
    public static void main(String[] args) {
        Maison maison = new Maison("orange",4,12.5,20);
        System.out.println(maison.getCouleur());
        maison.setCouleur("bleu");
        System.out.println(maison.getCouleur());
        maison.setCouleur("rouge");
        System.out.println(maison.getCouleur());


        Maison maisonJolie = new Maison("jaune",1,2,3);

        // attributs de maison sont public et Nombre de maisons est static donc il faut passer par un getter donc :
        System.out.println("nombre de maisons instanciées :"+Maison.getNombreMaisons());
        System.out.println(maison.nomLatin);

        /// EXEMPLE DE METHODES STATIQUES

        Math.round(120.3);
        System.out.println(Math.round(120.3));






    }
}
