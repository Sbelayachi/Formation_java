//EXERCICE 1 - Tableaux - SLIDE 64
// 1.//Déclarer un tableau de 100 éléments et l'initialiser
//2. //Afficher les éléments par dizaine séparés d'une virgule

package exos.tableaux;

public class Exo1_tableau {
    public static void main(String[] args) {
        int[] tableau = new int[100];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i + 1;
            System.out.print(tableau[i]);

            if ((i + 1) % 10 == 0) {
                System.out.print(",\n");
            }
        }
    }
}