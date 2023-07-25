// Exercice : Maximum de 3 nombres
//1.Créer 3 variables : nombre1, nombre2, nombre3
//2.Affecter des valeurs aux variables
//3.Créer des structures conditionnelles permettant d'afficher lemaximum parmis les 3 nombres créésprécédemment


package exos.autres;
import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        int nombre1, nombre2, nombre3;

        System.out.print("veuillez saisir 3 nombre entier : ");
        Scanner sc = new Scanner(System.in);
        nombre1 = sc.nextInt();
        nombre2 = sc.nextInt();
        nombre3 = sc.nextInt();

        if( nombre1 >= nombre2 && nombre1 >= nombre3)
            System.out.println("la valeur maximale est : "+nombre1);
        else if (nombre2 >= nombre2 && nombre2 >= nombre3)
            System.out.println("La valeur maximale est: "+nombre2);
        else
            System.out.println("La valeur maximale: "+nombre3);
    }
}