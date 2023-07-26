package org.example.exercice4_plante;

public class Main_plante {
    public static void main(String[] args) {
        Plantes plantes = new Plantes("pommier",1.68,"vert");
        plantes.afficher();

        Arbre arbre = new Arbre ("rosier",1.50, "rouge");
        arbre.afficher();


        System.out.println(plantes);
        System.out.println(arbre);
    }
}
