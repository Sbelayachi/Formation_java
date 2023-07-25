// Exercice : Pair ou impair diapo 69
// 1.Créer une variable nombre de type entier
// 2.Affecter une valeur à la variable nombre
//   3. Créer une condition qui permet d'afficher si le nombre est pair ou impair
package exos.autres;
import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args) {
        Scanner scanner ;
int age;
        scanner = new Scanner(System.in);
        System.out.print("saisir un nombre : ");
        age = scanner.nextInt();
        if (age >= 18)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }
}