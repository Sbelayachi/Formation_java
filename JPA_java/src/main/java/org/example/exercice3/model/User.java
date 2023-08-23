package org.example.exercice3.model;

import javax.persistence.*;
import java.util.List;


@Entity
    @Table(name= "users")


    public class User {

// relation inverse avec Task (one) utilisateurs (many)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)




    private int id;

    @Column(name = "user_name")

    private String name;

    @OneToMany(mappedBy = "user",cascade = {CascadeType.ALL})
    private List<Task> tasks;



    // Constructeur VIDE


    public User(String userName) {
    }

    ///// Getter et setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }


// ToString

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}