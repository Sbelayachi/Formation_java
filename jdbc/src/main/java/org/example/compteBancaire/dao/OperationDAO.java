package org.example.compteBancaire.dao;

import org.example.compteBancaire.modeles.Client;
import org.example.compteBancaire.modeles.Operation;

import java.sql.Connection;


public  class OperationDAO extends BaseDAO<Operation> {
    public OperationDAO(Connection connection) {
        super(connection);
    }


    