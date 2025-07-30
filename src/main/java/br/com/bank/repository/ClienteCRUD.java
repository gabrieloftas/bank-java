package br.com.bank.repository;

import br.com.bank.model.Cliente;

public class ClienteCRUD {
    private Cliente[] clientes = new Cliente[5];

    public ClienteCRUD() {
    }

    public void adicionarCliente(Cliente clienteADD) {
       try{
           for (int i = 0; i < clientes.length; i++) {
               if (clientes[i] == null) {
                   this.clientes[i] = clienteADD;
                   return;
               }
           }
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
    }

    public void removeCliente(Cliente clienteREM) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(clienteREM)) {
                clientes[i] = null;
                System.out.println("Cliente removido com sucesso");
                return;
            }
            System.err.println("CLiente não encontrado");
        }
    }

    //todo alterar cliente tostring
    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void atualizarClientes(Cliente clienteATT, int score) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].equals(clienteATT)) {
                clientes[i].setScore(score);
                System.out.println("Cliente atualizado com sucesso");
                return;
            }
            System.err.println("Cliente não encontrado");
            return;
        }
    }
}
