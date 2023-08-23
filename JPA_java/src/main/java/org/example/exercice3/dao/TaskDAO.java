package org.example.exercice3.dao;

import jdk.jshell.spi.ExecutionControl;
import org.example.impl.exercice2.model.Task;

import java.util.List;

public interface TaskDAO<T> {
//
//    public boolean addTask(Task task);
//
////  public List<Task> getAllTasks();
//
//    public boolean deleteTask(Long taskId);
//
//    public boolean markTaskAsCompleted(Long taskId);



    // EXO 3

    void closeDAO();
    boolean add(T element);
    List<T> get();
    T get(int id);
    boolean update(T element) throws ExecutionControl.NotImplementedException;
    boolean delete(int id);
}






