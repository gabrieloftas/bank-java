package br.com.bank.repository.impl;

import br.com.bank.model.Cliente;
import br.com.bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private static final Cliente[] DATABASE = new Cliente[30];


    @Override
    public void create(Cliente typeClass) {
        for (int i = 0; i < DATABASE.length; i++) {
            if (DATABASE[i] == null) {
                DATABASE[i] = typeClass;
                return;
            }
        }
    }

    @Override
    public Cliente get(String key) {
        try{
            return DATABASE[getIndex(key)];
        }
        catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public List<Cliente> getAll() {
        return new ArrayList<Cliente>(Arrays.stream(DATABASE).toList());
    }

    @Override
    public void update(String key, Cliente typeClass) {
        for (int i = 0; i < DATABASE.length; i++) {
            if (DATABASE[i].equals(typeClass)) {
                DATABASE[i] = typeClass;
            }
        }
    }

    @Override
    public void delete(String key) {
        try{
            DATABASE[getIndex(key)]=null;
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível excluir o cliente");
        }

    }

    private int getIndex(String key) {
        for (int i = 0; i < DATABASE.length; i++) {
            if (DATABASE[i].getCpf().equals(key)) {
                return i;
            }
        }
        return -1;
    }
}






