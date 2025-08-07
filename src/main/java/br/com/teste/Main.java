package br.com.teste;

import br.com.bank.model.Cliente;
import br.com.bank.repository.ClienteCRUD;
import br.com.bank.repository.ClienteDAO;
import br.com.bank.repository.impl.ClienteDAOImpl;

public class Main {
    public static void main(String[] args) {
        Cliente p1 = new Cliente();
        Cliente p2 = new Cliente();
        Cliente p3 = new Cliente();
        Cliente p4 = new Cliente();
        p1.setNome("Gabriel");
        p2.setNome("Antonio");
        p3.setNome("Joana");
        p4.setNome("Anastacio");
        ClienteDAO crud = new ClienteDAOImpl();
        crud.create(p1);
        crud.create(p2);
        crud.delete(p1.getCpf());
        //crud.atualizarClientes(p2,50);
    }
}
