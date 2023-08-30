package org.example.exercice.utils;

import org.example.exercice.entities.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

    public static void main(String[] args) {

        // Création d'un registre pour charger la configuration à partir de notre fichier de configuration
        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();

        // Création de la session
        Session session = sessionFactory.openSession();


        // Ajout de 5 produits

        session.getTransaction().begin();
        Produit pdt = new Produit();
        pdt.setNom("");
        pe.setPrenom("");
        session.save(pe);
        System.out.println("ID de la personne : " + pe.getId());

        session.getTransaction().commit();



    }
}
