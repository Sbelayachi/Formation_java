package org.example.utils;

import org.example.entities.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.Date;

public class TestProduit {

    // Configuration de Hibernate
    StandardServiceRegistry registre = new StandardServiceRegistryBuilder().configure().build();
    SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();


    // création de la session
    Session session = sessionFactory.openSession();


    // ajouter les 5 produits


        Produit produit = new Produit();
produit.set ("lv" );
produit.setReference("Reference " );
        produit.setDateAchat(new Date());
        produit.setPrix(10.0 * i);
        produit.setStock(10 * i);
        session.save(produit);


    // Affichage des informations du produit avec id = 2
    Produit produit2 = session.get(Produit.class, 2);
        System.out.println("Informations du produit avec id = 2:");
        System.out.println("Marque: " + produit2.getMarque());
        System.out.println("Reference: " + produit2.getReference());
        System.out.println("Date d'achat: " + produit2.getDateAchat());
        System.out.println("Prix: " + produit2.getPrix());
        System.out.println("Stock: " + produit2.getStock());

    // Suppression du produit avec id = 3
    Produit produit3 = session.get(Produit.class, 3);
        session.delete(produit3);

    // Modification des informations du produit avec id = 1
    Produit produit1 = session.get(Produit.class, 1);
        produit1.setMarque("Nouvelle marque");
        produit1.setReference("Nouvelle ref");
        produit1.setDateAchat(new Date());
        produit1.setPrix(20.0);
        produit1.setStock(5);
        session.update(produit1);

        tx.commit();
        session.close();
        sf.close();
}
