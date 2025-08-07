package br.com.bank.repository.impl;

import br.com.bank.model.Cliente;
import br.com.bank.model.Funcionario;
import br.com.bank.repository.FuncionarioDAO;

import java.util.HashMap;
import java.util.List;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    HashMap<Integer,Funcionario> hashMap = new HashMap<>();

    @Override
    public void createFuncionario(Funcionario funcionario) {

        for (int i = 0; i < hashMap.size(); i++) {
            if (!hashMap.containsKey(i)){
                hashMap.put(i,funcionario);
            }
        }
    }

    @Override
    public Funcionario getFuncionario(String matricula) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).getMatricula().equals(matricula)){
                return hashMap.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Funcionario> getAll() {
        return List.of();
    }

    @Override
    public void updateFuncionario(String matricula, Funcionario funcionario) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).getMatricula().equals(matricula)){
                hashMap.put(i,funcionario);
                return;
            }
        }
    }

    @Override
    public void deleteFuncionario(String matricula) {
        for (int i = 0; i < hashMap.size(); i++) {
            if (hashMap.get(i).getMatricula().equals(matricula)){
                hashMap.remove(i);
            }
        }
    }
}
