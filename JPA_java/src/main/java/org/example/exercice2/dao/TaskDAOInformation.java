package org.example.exercice2.dao;

import org.example.exercice2.model.TaskInformation;

import javax.persistence.EntityManagerFactory;

public class TaskDAOInformation {
    private final EntityManagerFactory emf;

    public TaskDAOInformation(EntityManagerFactory entityManagerFactory) {
        emf = entityManagerFactory;
    }

    public void closeDAO() {
        emf.close();
    }

    public TaskInformation get(int id) {
        return null;
    }

    public boolean update(TaskDAOInformation element) {
        return false;
    }

}
