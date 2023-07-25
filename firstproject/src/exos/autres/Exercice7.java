// Exercice : Voyelle ou consonne
//1.Créer une variable caractere
//2.Affecter une valeur à la variable caractere
//3.A l'aide des structures conditionnelles, déterminer si le caractèreest une consonne ou une voyelle
package exos.autres;
import  java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lettre;
        System.out.print("veuillez saisir une lettre : ");
        Scanner sc = new Scanner(System.in);
        lettre = scanner.next().charAt(0);

        if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u'
                || lettre == 'A' || lettre == 'E' || lettre == 'I' || lettre == 'O' || lettre == 'U') {
            System.out.println(lettre + " est une voyelle.");
        } else {
            System.out.println(lettre + " est une consonne.");
        }
    }
}





