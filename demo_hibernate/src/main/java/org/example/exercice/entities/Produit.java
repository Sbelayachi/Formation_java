package org.example.exercice.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "personne")

public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom")

    private String marque;
    private String reference;
    private Date dateAchat;
    private Double prix;
    private int stock;


    public Produit() {
    }
}
