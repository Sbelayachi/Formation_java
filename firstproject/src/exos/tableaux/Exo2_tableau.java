// Exercice : Tableau positif
//1.Déclarer deux tableaux de 10 éléments
//2.Le premier tableau contiendra des nombres négatifs et positifs
//3.Ajouter tous les éléments positifs du premier tableau dans les second tableau

package exos.tableaux;

public class Exo2_tableau {
    public static void main(String[] args) {


    int[] tableauA = new int[10];
    int [] tableauB = new int[10];

    for (int i = 0; i < tableauA.length ; i++)
    {
        if (tableauA[i] > 0)
        {tableauB[i] = tableauA[i];
            i++;  }
    }

        System.out.println ("Éléments positifs dans le second tableau : ");
        for (int i = 0; i < i; i++)
        {System.out.print(tableauB[i] + " ");}

    }}
