// Exercice 1 DIAPO

package exos.autres;

import  java.util.Scanner;
// * Installation de l'objet "scanner" pour récupérer la saisie de l'utilisateur
public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ** Demander à l'utilisateur de saisir un prénom
        System.out.println("veuillez saisir un prénom : ");
        // *** déclaration du type de la variable prénom + Récupération de la saisie sur la ligne suivante après avoir fait ENTREE
        String prenom = scanner.nextLine();
        // ** Demander à l'utilisateur de saisir un nom
        System.out.print("veuillez saisir un nom : ");
        // *** déclaration du type de la variable nom + Récupération de la saisie sur la ligne suivante après avoir fait ENTREE
        String nom = scanner.nextLine();
        // *** déclaration du type de la variable nomComplet + sa valeur : concaténation du prénom et du prénom avec un espace
        String nomComplet = prenom.concat(nom);
        // + Affichage du message du "Bonjour + valeur de la variable nomComplet
        System.out.println(" Bonjour " +nomComplet);
        // OU Affichage du message du "Bonjour + valeur des variables prenom et nom avec espace :
          // System.out.println(" Bonjour " +prenom + " " + nom);
        }
    }


