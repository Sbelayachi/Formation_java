//Exercice : Candidature - SLIDE
//1.Ecrire un programme qui permet de vérifier si un profil est valable pour une candidature
//2.Le profil contient trois critères :
// - age : supérieur à 30 ans
// - salaire demandé : maximum 40 000€
//-  années d'expériences : minimum 5 ans
//3.//Afficher un message pour chaque condition non respectée

package exos.autres;


import java.util.Scanner;

public class Exo10_boucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, experience;
        double salaire;
        System.out.println("Veuillez saisir votre âge");
        age = scanner.nextInt();
        System.out.println("Veuillez saisir le salaire max demandé en euros");
        salaire = scanner.nextDouble();
        System.out.println("Combiend d'année(s) d'expérience avez vous ?");
        experience = scanner.nextInt();

        if (age > 30 && salaire < 40000 && experience > 5)
        { System.out.println("Vous, AVEZ le profil requis");}
        else
        { System.out.println("Désolée, Vous n'avez PAS le profil requis");}

    }
    }

