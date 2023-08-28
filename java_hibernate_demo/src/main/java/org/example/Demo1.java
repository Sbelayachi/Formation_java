package org.example;

import org.example.entities.Personne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Demo1 {

    public static void main(String[] args) {

    // Creation d'un regitre pour chaerger ka confirgation à partir de notre fichier de configuratiion.
        StandardServiceRegistry registre = new StandardServiceRegistryBuilder().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();


        //creation de la session
        Session session = sessionFactory.openSession();

        // Dès l'ouverture de la session et en fonction de la propriété hibernate.hbm2ddl.auto hibernate va agir


        // AJOUT D'une personne

        session.getTransaction().begin();
        Personne pe = new Personne();
        pe.setNom("toto");
        pe.setPrenom("tata");
        session.save(pe);
        System.out.println("ID de la personne : " + pe.getId());

        session.getTransaction().commit();






        // récuperer une personne
        // session.getTransaction().begin()
        Personne p = session.load(Personne.class,1L);
        System.out.println(p.getNom());


        // Modification
        // Attention il est important d'être dans la même transaction si on souhaite modifier ou supprimer
        // On met à jour avec la méthode UPDATE

        p.setPrenom("titi");
        session.update(p);

        session.getTransaction().commit();


        // Supprimer avec la methode DELETE
        session.delete(p);


        // Fermeture de la session et de la sessionfactory
        session.close();
        sessionFactory.close();

    }
}
