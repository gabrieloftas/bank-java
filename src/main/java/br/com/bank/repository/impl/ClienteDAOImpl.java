package br.com.bank.repository.impl;

import br.com.bank.model.Cliente;
import br.com.bank.repository.ClienteDAO;

import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private Cliente[] clientes = new Cliente[30];

    @Override
    public void createCliente(Cliente cliente) {
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
    public Cliente getCliente(String cpf) {
        return null;
    }

    @Override
    public List<Cliente> getAll() {
        return List.of();
    }

    @Override
    public void updateCliente(String cpf, Cliente cliente) {

    }

    @Override
    public void deleteCliente(String cpf) {

    }
}


