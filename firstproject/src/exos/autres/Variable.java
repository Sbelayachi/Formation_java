package exos.autres;

public class Variable {
    public static void main(String[] args) {
        // declaration d'une variable
        // <type> <nom> ;
        // int : entier sur 32 bits
        int age;
        // long : entier sur 64 bits
        long indice;
        float distance ;
        double monnaie;
        boolean estVrai;
        char lettre ;

        // chaine de caractère
        // string n'est pas considéré comme un type primitif
        String prenom;

        // <type> <nom> = <valeur>
        int jour = 5;
       // affectation
        age = 25;
        indice = 100_000_000;
        distance = 12.74f;
        monnaie = 15.5;
        estVrai = false;
        lettre = 'a';
        prenom = "toto";
        double resultat = age + monnaie;

        // printLn permet d'afficher des enregistrements dans la suite
        System.out.println(resultat);

        System.out.println(age);
        System.out.println(indice);
        System.out.println(distance);
        System.out.println(monnaie);
        System.out.println(estVrai);
        System.out.println(prenom);

        // les types énumérés (enum)
        enum JourSemaine {
            LUNDI,MARDI,MERCREDI
        }
        JourSemaine today = JourSemaine.MARDI;
        System.out.println(today);

    }
}
