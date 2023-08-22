package org.example.exercice2.model;


import javax.persistence.*;

@Entity
@Table(name= "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
// ===> TASK = maitre sur Taskinformation contient la clé étrangère
    private String title;
    private boolean completed;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_id")
    private TaskInformation info;

    // CONSTRUCTEUR VIDE
    public Task() {
    }

    // GETTER ET SETTER


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public TaskInformation getInfo() {
        return info;
    }

    public void setInfo(TaskInformation info) {
        this.info = info;
    }


   // TO STRING


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                ", info=" + info +
                '}';
    }
}