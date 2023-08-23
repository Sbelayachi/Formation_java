package org.example.exercice3.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task_info")
public class TaskInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_id")
    private int id;

    private String description;

    private Date dateEcheance;

    private int priorite;

    @OneToOne(mappedBy = "info")
    private Task task;


// Constructeur


    public TaskInformation(int id, String description, Date dateEcheance, int priorite, Task task) {
        this.id = id;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.priorite = priorite;
        this.task = task;
    }


    // Getter et setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public int getPriorite() {
        return priorite;
    }

    public void setPriorite(int priorite) {
        this.priorite = priorite;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }


    /// ToSTRING

    @Override
    public String toString() {
        return "TaskInformation{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dateEcheance=" + dateEcheance +
                ", priorite=" + priorite +
                ", task=" + task +
                '}';
    }
}