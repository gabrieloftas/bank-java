package br.com.teste;

import br.com.bank.model.Cliente;
import br.com.bank.repository.ClienteCRUD;

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
        ClienteCRUD crud = new ClienteCRUD();
        crud.adicionarCliente(p1);
        crud.mostrarClientes();
        crud.adicionarCliente(p2);
        crud.mostrarClientes();
        crud.removeCliente(p1);
        //crud.atualizarClientes(p2,50);
        crud.mostrarClientes();
    }
}
