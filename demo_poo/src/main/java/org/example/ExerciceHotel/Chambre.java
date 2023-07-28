package org.example.ExerciceHotel;

public class Chambre {

    private int numero;
    private boolean statut;
    private int nombreLit;
    private double tarif;


///     Constructeur

    public Chambre(int numero, boolean statut, int nombreLit, double tarif) {
        this.numero = numero;
        this.statut = statut;
        this.nombreLit = nombreLit;
        this.tarif = tarif;
    }

    //// get et set


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getNombreLit() {
        return nombreLit;
    }

    public void setNombreLit(int nombreLit) {
        this.nombreLit = nombreLit;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }


    // ToString


    @Override
    public String toString() {
        return "Chambre{" +
                "numero=" + numero +
                ", statut=" + statut +
                ", nombreLit=" + nombreLit +
                ", tarif=" + tarif +
                '}';
    }
}

