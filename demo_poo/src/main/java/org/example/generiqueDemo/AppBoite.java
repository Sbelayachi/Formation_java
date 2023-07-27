package org.example.generiqueDemo;

public class AppBoite {
    public static void main(String[] args) {

    /// BOITE POUR CHAINE DE CARACTERE
        Boite<String> boiteString = new Boite<>("contenu de la boite"); // déclaration du type de variable = objet de type String
        String contenuString = boiteString.getContenu();
        System.out.println("contenu de la boite : " + contenuString);



//        /// BOITE POUR CHAT
//        Boite<Chat> boiteChat = new Boite<>(new Chat ("fifi",42,"bleue"); // déclaration du type de variable = objet de type String
//        Chat contenuChat = boiteChat.getContenu();
//        System.out.println("contenu de la boite : " + contenuChat);

        /// BOITE POUR un double
        Boite<Double> boiteDouble = new Boite<>(3.14); // déclaration du type de variable = objet de type double = valeur = Double
        Double contenuDouble = boiteDouble.getContenu();
        System.out.println("contenu de la boite : " + contenuDouble);

    }
}
