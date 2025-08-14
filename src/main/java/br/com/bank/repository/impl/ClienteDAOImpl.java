package br.com.bank.repository.impl;

import br.com.bank.model.Cliente;
import br.com.bank.repository.ClienteDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private static final Cliente[] CLIENTES = new Cliente[30];


    @Override
    public void create(Cliente typeClass) {
        for (int i = 0; i < CLIENTES.length; i++) {
            if (CLIENTES[i] == null) {
                CLIENTES[i] = typeClass;
                return;
            }
        }
    }

    @Override
    public Cliente get(String key) {
        //Duvida
        for (int i = 0; i < CLIENTES.length; i++) {
            if (CLIENTES[i].equals(Cliente));
        }
    }

    @Override
    public List<Cliente> getAll() {
        return new ArrayList<Cliente>(Arrays.stream(CLIENTES).toList());
    }

    @Override
    public void update(String key, Cliente typeClass) {
        for (int i = 0;i < CLIENTES.length; i++){
            if (CLIENTES[i].equals(typeClass)){
                CLIENTES[i]=typeClass;
            }
        }
    }

    @Override
    public void delete(String key) {
        //Duvida
    }
}



