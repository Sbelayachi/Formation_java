package org.example.compteBancaire.modeles;

public class Operation {

private int idOperation;
    private int numero;
    private double montant;
    private Statut statut;


// Constructeur

    public Operation(int numero, double montant, Statut statut) {
        this.numero = numero;
        this.montant = montant;
        this.statut = statut;
    }



// Getter et Setter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }


    public enum Statut {
        DEPOT,
        RETRAIT
    }
}
