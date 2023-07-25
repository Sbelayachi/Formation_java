// Exercice : Chapitres
//1.Créer un programme qui permet d'afficher un nombre de chapitres et de sous-parties
//2.Le programme demandera le nombre de chapitres ainsi que le nombre de sous-parties àafficher
package exos.autres;
import java.util.Scanner;
public class Exo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chap, souspartie;
        System.out.println("Saisir un nombre de chapitre : " ); // Todo declarer les variable
        chap = scanner.nextInt();
        System.out.println("Saisir un nombre de sous_partie : " );
        souspartie = scanner.nextInt();
// TODO faire la correction
        for ( int i = 0; i>0;i++)
        {
            System.out.println(chap + souspartie + "partie"+chap +"."+i++);
    }
}}
