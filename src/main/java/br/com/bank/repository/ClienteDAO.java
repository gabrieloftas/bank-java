package br.com.bank.repository;

import br.com.bank.model.Cliente;

import java.util.List;

public interface ClienteDAO {
    public void createCliente(Cliente cliente);
    public Cliente getCliente(String cpf);
    public List<Cliente> getAll();
    public void updateCliente(String cpf,Cliente cliente);
    public void deleteCliente(String cpf);
}
