package org.example.compteBancaire.dao;

import org.example.compteBancaire.modeles.Client;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends BaseDAO<Client> {
    public ClientDAO(Connection connection) {
        super(connection);
    }


    // Sauvegarder un client

    @Override
    public boolean save(Client element) throws SQLException {
        request = "INSERT INTO client (first_name, last_name, liste_compte,telephone_client) VALUES (?,?,?,?)" ;
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getNom());
        statement.setString(2, element.getPrenom());
        statement.setArray(3, (Array) element.getComptes());
        statement.setString(4, element.getTelephoneClient());


        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            element.setIdClient(resultSet.getInt(1));
        }
        return nbRows == 1;
    }


    // Modifier un client

    public boolean update(Client element) throws SQLException {
        request = "UPDATE person set first_name = ?, last_name = ?, liste_compte = ?, telephone_client = ? where id = ?";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getNom());
        statement.setString(2, element.getPrenom());
        statement.setArray(3, (Array) element.getComptes());
        statement.setString(4, element.getTelephoneClient());
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

// suprrimer un client

    @Override
    public boolean delete(Client element) throws SQLException {
        request = "delete from compte_Bancaire where id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getIdClient());
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

// afficher un client par son Id
    @Override
    public Client get(int id) throws SQLException {
        Client client = null;
        request = "select * from client where id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        if(resultSet.next()) {
            client = new Client(resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"));
                     resultSet.getString("liste_compte");
                    resultSet.getString("telephone_client");
        }
        return client;
    }


// afficher une liste de clients

    @Override
    public List<Client> get() throws SQLException {
        List<Client> result = new ArrayList<>();
        request = "select * from client";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while(resultSet.next()){
            Client client = new Client(resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"));
                    resultSet.getString("liste_compte");
                    resultSet.getString("telephone_client");
            result.add(client);
        }
        return result;
    }
}






