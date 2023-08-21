package org.example.DAO;

import org.example.entity.TodoList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ToDoListDAO {


    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_demo_postgres");


    // 1 AJOUTER UNE "TO DO" à ma liste
    public static void main() {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TodoList todoList = new TodoList("faire à manger",true);
        System.out.println("ID de la ToDoListe : "+todoList.getId());
        em.persist(todoList);
        System.out.println("ID de la ToDoListe aprés persist : "+todoList.getId());
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // 2 AFFICHER TOUTES LES  "TO DO"

    public static void createQuery(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<TodoList> todoList = null;

        todoList = em.createQuery("select l from Todoliste l", TodoList.class).getResultList();

        for (TodoList l:todoList){
                System.out.println(l);
        }
        em.getTransaction().commit();

    }


    // 3 MARQUER UNE "TO DO" COMME FINIE

    public static void ChangerStatut (){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TodoList person = em.find(TodoList.class, 2L);
        System.out.println(person.toString());
        person.setTitre("Faire mes devoirs");
        System.out.println(person.toString());
        em.getTransaction().commit();
        em.close();
        emf.close();

    }

    // QUITTER


    // 4 SUPPRIMER UNE "TO DO"
    public static void remove(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TodoList person = em.find(TodoList.class, 1L);
        em.remove(person);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }


}







}
