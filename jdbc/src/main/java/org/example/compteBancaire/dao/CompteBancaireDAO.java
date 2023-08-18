package org.example.compteBancaire.dao;


import org.example.compteBancaire.modeles.Client;
import org.example.compteBancaire.modeles.CompteBancaire;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class CompteBancaireDAO extends BaseDAO<CompteBancaire> {

    public CompteBancaireDAO(Connection connection) {
        super(connection);
    }


    // Sauvegarder un compte

    @Override
    public boolean save(CompteBancaire element) throws SQLException {
        request = "INSERT INTO compteBancaire (sold, customer,list_operations) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request,Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getSolde());
        statement.setObject(2, element.getClient());
        statement.setArray(3, (Array) element.getOperations());

        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setIdCompte(resultSet.getInt(1));

        }
        return nbRows == 1;
    }

    // modifier un compte

    @Override
    public boolean update(CompteBancaire element) throws SQLException {
        request = "UPDATE compteBancaire set sold = ?, customer = ?, list_operations=?, where id = ?";

        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getSolde());
        statement.setObject(2, element.getClient());
        statement.setArray(3, (Array) element.getOperations());

        int nbRow = statement.executeUpdate();
        return nbRow ==1;    }

// supprimer un compte

   @Override
    public boolean delete(CompteBancaire element) throws SQLException {

       request = "delete from compte_Bancaire where id = ?";
       statement = _connection.prepareStatement(request);
       statement.setInt(1, element.getIdCompte());
       int nbRow = statement.executeUpdate();
       return nbRow ==1;
   }



// Afficher une liste de compte

    @Override
    public List<CompteBancaire> get() throws SQLException {
        List<CompteBancaire> result = new ArrayList<>();
        request = "select * from compteBancaire";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();

        while(resultSet.next()){
            CompteBancaire compteBancaire = new CompteBancaire(resultSet.getInt("id"),
                    resultSet.getInt("id_compte"),
                    resultSet.getDouble("sold");
                    resultSet.getObject("customer");
                    resultSet.getArray("liste_compte");
                    result.add(compteBancaire);
        }
        return result;
    }


















}
