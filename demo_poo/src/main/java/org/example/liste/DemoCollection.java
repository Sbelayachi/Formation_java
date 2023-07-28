package org.example.liste;


import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {

// Démo pour Vector

        Vector<String> vector = new Vector<>();
        vector.add ("Apple");
        vector.add ("Banana");
        vector.add ("Organge");
        System.out.println("Vecteur : "+vector);
// ==> Affichage = Vecteur : [Apple, Banana, Organge]



// méthode pour Vector
        System.out.println("1-Taille du vercto"+vector.size()+ "\n"); // recup la taille de vetcor
        System.out.println("2-Element à l'index : "+vector.get(1)+ "\n"); // recup l'élément à l'index 1 = Banana
        System.out.println("3-Esct ce que l'Element est présent : " + vector.contains("Banana")+ "\n"); // vérifier si l'élément "banana" exist
        System.out.println("3-Esct ce que l'Element est présent : " + vector.contains("Banane")+ "\n"); // vérifier si l'élément "banane" exist



        // DEMO SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add ("Java");
        sortedSet.add ("Python");
        sortedSet.add ("JavaScript"); // non ajouté car DOUBLONS
        sortedSet.add ("JavaScript"); // non ajouté car DOUBLONS
        System.out.println( " SortedSet : "+ sortedSet);


        // METHODES POUR sortedSet

        System.out.println("1 . Premier élément : "+sortedSet.first()); // récup premier élément du sorted set
        System.out.println("1 . Premier élément : "+sortedSet.last()); // récup premier dernier du sorted set
        sortedSet.headSet("Python"); // récup élément à partir de la tete de sortedSet.headSet
        SortedSet<String> headset = sortedSet.headSet(("JavaScript"));
        System.out.println("3. Sous ensemble avant \"JavaScript\""+ headset);



        //DEMO pour LinkedList
LinkedList<Double> linkedList = new LinkedList<>();
linkedList.add(3.14);
linkedList.add(2.314);
linkedList.add(1.314);
System.out.println("LinkedList"+linkedList);

    System.out.println("1- Premire élément : " + linkedList.getFirst());
    System.out.println("2- Dernier élément : " + linkedList.getLast());
    linkedList.removeFirst();
    System.out.println("suppression du dernier élément " + linkedList);


        //Demo pour

        SortedMap<String,Integer> sortedMap = new TreeMap<>()       ;
        sortedMap.put ("Java",20);
        sortedMap.put ("Python",10);
        sortedMap.put ("C++",30);

        System.out.println(" SortedMap : "+sortedMap);


        // Méthodes pour SortedMap

        System.out.println( "1- clés de sortedMap"+sortedMap.keySet());
        System.out.println( "2- Valeurs de sortedMap"+sortedMap.keySet());
        sortedMap.remove ("Java");
        System.out.println( "sortedMap"+sortedMap);


        // Démo pour le HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put ("Java",20);
        hashMap.put ("Python",10);
        hashMap.put ("C++",30);
        System.out.println( "hashMap"+hashMap);



        // Méthodes pour le HashMap

        System.out.println("1- Taille du HashMap" + hashMap.size());
        System.out.println("2- Valeur associée à la clé 'JAVA': "+hashMap.get("Java"));
        System.out.println("3- Vérification si clé présente : "+hashMap.containsKey("Banana"));
        hashMap.remove("Python");
        System.out.println("Suppression de l'entrée avec la clé Python");
        System.out.println("hashMap : " +hashMap);
    }
}
