package org.example.demo.entities;


import javax.persistence.*;

// Hibernate utilise les meme annotations que JPA
@Entity
@Table(name = "personne")
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;
    private String prenom;
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "entreprise_id")
    private org.example.demo.entities.Entreprise entreprise;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public org.example.demo.entities.Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(org.example.demo.entities.Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
