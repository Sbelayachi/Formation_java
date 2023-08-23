package org.example.exercice3.model;


import javax.persistence.*;

@Entity
@Table(name= "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    // Relation One to many avec utilisateur => task est maitre de la relation
    // Task (many) utilisateurs (one)


    @ManyToOne
    @JoinColumn(name="user_ID", nullable = false)
    private User utilisateur;






// ===> TASK = maitre sur Task information contient la clé étrangère

    private String title;
    private boolean completed;
    private TaskInformation taskInformation;

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

    public User getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(User utilisateur) {
        this.utilisateur = utilisateur;
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


    // methode exercice 3



    public User getUser() {
        return utilisateur;
    }












    // methodes exercice 2
    public TaskInformation getTaskInformation() {
        return taskInformation;
    }

    public void setTaskInformation(TaskInformation taskInformation) {
        this.taskInformation = taskInformation;
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
                ", utilisateur=" + utilisateur +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                ", taskInformation=" + taskInformation +
                ", info=" + info +
                '}';
    }
}