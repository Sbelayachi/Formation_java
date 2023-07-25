package org.example.base;

public class Voiture {

    // attributs d'instance
    // <visibilité> <type> <nom>


    // public = accessible en dehors de la classe
    public String couleur;
    public int carbutant;
    public int puissance;

    // private : accessible uniquement dans la classe
    private String marque;

    // PROTECTED : acessible dans la classe et dans les enfants qui héritent de cette classe

    protected int nombrePorte;

    // Premère méthode = CONSTRUCTEUR = définit comment est constuire la classe
    // Le constructeur a le nom de la classe


    @Override
    public String toString() {
        return "Voiture{" +
                "couleur='" + couleur + '\'' +
                ", carbutant=" + carbutant +
                ", puissance=" + puissance +
                ", marque='" + marque + '\'' +
                ", nombrePorte=" + nombrePorte +
                '}';
    }

    public Voiture () {
        System.out.println("je suis dans le constructeur sans paramètre");}



    // POLYMORPHISME : possibilité de définir plusieurs méthodes avec le même nom mais des signatures différentes

    public Voiture (String couleur) {
        // Mot clé "THIS" : this (<paramètres>) appelle le constucteur avec la signature similaire
        this();
        System.out.println("je suis dans le constructeur avec la coulis ");
        this.couleur = couleur;
    }
// Exemple avec paramètres couleur/carburant et puissance : METHODE 1
    //public Voiture (String couleur, int carbutant, int puissance) {
    // this.couleur = couleur;
    // this.carbutant = carbutant;
    // this.puissance = puissance;
    // System.out.println("je suis dans le constructeur avec tous les attributs");}

// Exemple avec paramètres couleur/carburant et puissance : METHODE 1
    public Voiture (String couleur, int carbutant, int puissance) {
        this(couleur);
        this.carbutant = carbutant;
        this.puissance = puissance;
        System.out.println("je suis dans le constructeur avec tous les attributs");}

   // clic droit + generate + choisir les attributs  = creation du constructeur automatique
        public Voiture(String couleur, int carbutant, int puissance, String marque, int nombrePorte) {
        this.couleur = couleur;
        this.carbutant = carbutant;
        this.puissance = puissance;
        this.marque = marque;
        this.nombrePorte = nombrePorte;}


    // METHODE D'INSTANCE

// <visibilité> <type de retour> <parametre>

    public void demarrer () {
        System.out.println("la voiure démarre");
    }
    public void freiner () {
        System.out.println("la voiure freine");
    }

    public void remplirReservoir (int volume) {
        carbutant += volume;  // += ==> carburant = lui même + carburants
    }

    public double puissanceChevauxFiscaux() {
    return puissance / 7.; // (7.0 car puissance est un double
    }


    // DESTRUCTEUR

    protected void finalize () {

    }


}

