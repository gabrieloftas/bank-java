package br.com.bank.repository.impl;

import br.com.bank.model.Cliente;
import br.com.bank.repository.ClienteDAO;

import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private static Cliente[] clientes = new Cliente[30];

    @Override
    public void create(Cliente cliente) {
        try{
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] == null) {
                    this.clientes[i] = cliente;
                    return;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Cliente get(String cpf) {
        return null;
    }

    @Override
    public List<Cliente> getAll() {
    	//TODO
        return List.of();
    }

    @Override
    public void update(String cpf, Cliente cliente) {
    	//TODO
    }

    @Override
    public void delete(String cpf) {
    	//TODO
    }
}


