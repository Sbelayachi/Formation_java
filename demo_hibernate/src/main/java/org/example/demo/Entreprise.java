package org.example.demo.entities;


import org.example.demo.Personne;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @OneToMany(mappedBy = "entreprise")
    private List<Personne> personnes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<org.example.demo.entities.Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<org.example.demo.entities.Personne> personnes) {
        this.personnes = personnes;
    }

    public void ajouterPersonne(org.example.demo.entities.Personne p) {
        personnes.add(p);
    }
}
