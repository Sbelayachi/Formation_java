package org.example.compteBancaire.modeles;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
    private int idCompte;
    private double solde;
    private Client client;
    private List<String> operations;


// Constructeur

    public CompteBancaire(double solde, double client, Object operations) {
        this.solde = solde;
        this.client = client;
        this.operations = new ArrayList<>();
    }


    // getter et setter


    public int getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(int idCompte) {
        this.idCompte = idCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<String> getOperations() {
        return operations;
    }

    public void setOperations(List<String> operations) {
        this.operations = operations;
    }

    // Methodes pour retrait et depot

    public void deposer(double montant) {
        solde += montant;
        operations.add("DEPOT: +" + montant);
    }

    // toString

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "idCompte=" + idCompte +
                ", solde=" + solde +
                ", client=" + client +
                ", operations=" + operations +
                '}';
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            operations.add("RETRAIT: -" + montant);
        } else {
            System.out.println("Solde insuffisant");
        }













    }
}



