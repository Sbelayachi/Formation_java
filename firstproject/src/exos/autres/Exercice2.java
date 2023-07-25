// Exercice 2 : Permuter deux variables, Slide 52

package exos.autres;
import  java.util.Scanner;
// * Installation de l'objet "scanner" pour récupérer la saisie de l'utilisateur
public class Exercice2 {
    public static void main(String[] args) {
        // Déclarer les le type des variables a et b
        int a;
        int b;
        Scanner sc = new Scanner(System.in);


        // Demander à l'utilisateur de saisir a et Récupération de la saisie des valeurs de a et de b
        System.out.print("saisir un nb entier  a : ");
        System.out.print("\nsaisir b : ");

        a = sc.nextInt();
        b = sc.nextInt();

        // afficher le message demandé "a = 3 et b = 5"
        System.out.println("vous avez saisi : a = " + a + " et b = " + b);

    }}




