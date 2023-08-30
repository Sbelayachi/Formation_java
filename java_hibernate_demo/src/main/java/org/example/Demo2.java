package org.example;

import org.example.entities.Personne;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();


        // HQL
        // recupérer la liste des personnes
        // le support urilise l'interface query au lieu de la classe générique query (l'interface est depréciée)

        Query<Personne> personneQuery = session.createQuery(("from Personne"));

        // avec la liste

        List<Personne> personnes = personneQuery.list();
        for (Personne p : personnes) {
            System.out.println(p.getNom());
        }


        // Avec l'ITERATOR

        Iterator
        }



}