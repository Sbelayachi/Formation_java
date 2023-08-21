package org.example.entity;

import javax.persistence.*;

// Annotation @Entity indique que la classe est une enité
@Entity
// Annotation @Table optionnelle par défaut nom de la classe
@Table(name = "person")

public class TodoList {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // Génération basée sur auto-incrémentation (utilisé dans MySQL, PostgreSQL, etc.)

private int id;
private String titre;
private boolean completed;


    // Constructeurs, getters et setters

    // 1 CONSTRUCTEUR VIDE

    public TodoList(String faireÀManger, boolean b) {
    }

    // CONSTRUCTEUR AVEC ATTRIBUTS

    public TodoList(int id, String titre, boolean completed) {
        this.id = id;
        this.titre = titre;
        this.completed = completed;
    }


// GETTER ET SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


// METHODE TO STRING


    @Override
    public String toString() {
        return "TodoList{" +
                "id=" + id +
                ", id=" + id +
                ", titre='" + titre + '\'' +
                ", completed=" + completed +
                '}';
    }
}
