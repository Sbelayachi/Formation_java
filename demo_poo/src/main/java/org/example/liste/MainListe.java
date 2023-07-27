//package org.example.liste;
//
//import java.util.AbstractList;
//import java.util.ArrayList;
//
//public class MainListe {
//    public static void main(String[] args) {
//
//        // création d'une arrayList :
//        // Arraylste <type> <nom> = new ArrayList>type<()
//        ArrayList<String> prenoms = new AbstractList<String>();
//
//
//        // la méthode pour ajoute des éléments à la liste : .add        prenoms.add("Sophie");
//        prenoms.add("Sophie");
//        prenoms.add("Toto");
//        prenoms.add("Dorian");
//
//
//        // La methode get permet d'accéder à un élément de son indice
//
//        System.out.println(prenoms.get(0));
//        System.out.println(prenoms.get(1));
//        System.out.println(prenoms.get(2));
//
//
//        // La methode set permet de modifier  un élément en précisant son index
//        prenoms.set(1, "asma");
//
//
//        // La methode remove permet de supprimer  un élément (en précisant son objet ou son index)
//        prenoms.remove(2);
//
//
//        // La methode size() permet de retourner la taille de la liste
//
//        System.out.println("taille de ma liste: " + prenoms.size());
//
//        // la boucle foreach permet de parcourir la liste
//
//        for (String prenom : prenoms) {
//            System.out.println(prenom);
//        }
//
//        // possibiliité de modifier un élément en précisant
//        int i;
//        for (int i = 0; i < prenoms.size(); i++) {
//            System.out.println(prenoms.get(i));
//
//        }
//
//    }
//}
