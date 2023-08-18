package org.example.compteBancaire.dao;

import org.example.compteBancaire.modeles.Client;
import org.example.compteBancaire.modeles.Operation;

import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public abstract class OperationDAO extends BaseDAO<Operation> {
    public OperationDAO(Connection connection) {
        super(connection);
    }


//    @Override
//    public boolean save(Operation element) throws SQLException {
//        request = "INSERT INTO operation (number_opération, rising, status) VALUES (?,?,?,?)" ;
//        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
//        statement.setInt(1, element.getNumero());
//        statement.setDouble(2, element.getMontant());
////        statement.setObject(3, (Array) element.getStatut());
//        return nbRows == 1;
//    }











    @Override
    public boolean update(Operation element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Operation element) throws SQLException {
        return false;
    }

    @Override
    public Operation get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Operation> get() throws SQLException {
        return null;
    }
}