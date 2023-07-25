package org.example.base;

public class Application_base {
    public static void main(String[] args) {

    // Instanciation d'un objet voiture
    Voiture voirure1 = new Voiture(); // affiche  "je suis dans le constructeur sans paramètre"


    // POur exécuter une méthode d'instance, il suffut de faire objet.methodes (<parametres>)
    voirure1.demarrer(); // affiche la voiture démarre


    // Pour accéder à un attribut PUBLIC, il ssufit de faire objet.attribut
        System.out.println(voirure1.carbutant);
        voirure1.remplirReservoir(15);
        voirure1.carbutant += 1;
        System.out.println(voirure1.carbutant); // affiche 16
        System.out.println(voirure1.couleur); // affiche null


        Voiture voiture2 = new Voiture ("rouge",50,120);
        System.out.println("##### VOITURE 3 #####");
        Voiture voiture3 = new Voiture("bleu");
        double chevauxFicaux = voiture2.puissanceChevauxFiscaux();
        System.out.println(chevauxFicaux);
        System.out.println(voiture2.puissanceChevauxFiscaux());

        System.out.println(voiture2); // renvoie le type de l'objet sans détail
        System.out.println(voiture2.toString()); // + to.String() = renvoie le type de l'objet sans détail avec la méthode (méthode de la classe propre à JAVA)
        System.out.println(voiture2.toString());

        /// DANS LA CLASSE VOITURE FAIRE UN CLIC DROIT + generate + to.String
            // et la affiche pour les 3 println
       // 1.Voiture{couleur='rouge', carbutant=50, puissance=120, marque='null', nombrePorte=0}
       // 2.Voiture{couleur='rouge', carbutant=50, puissance=120, marque='null', nombrePorte=0}
       // 3.Voiture{couleur='rouge', carbutant=50, puissance=120, marque='null', nombrePorte=0}

    }


    }
