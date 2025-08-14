package br.com.bank.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.bank.model.Funcionario;
import br.com.bank.repository.FuncionarioDAO;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private static final Map<String,Funcionario> DATABASE = new HashMap<>();


    @Override
    public void create(Funcionario typeClass) {
        DATABASE.put(typeClass.getCpf(),typeClass);
    }

    @Override
    public Funcionario get(String key) {
        return DATABASE.get(key);
    }

    @Override
    public List<Funcionario> getAll() {
        return new ArrayList<Funcionario>(DATABASE.values());
    }

    @Override
    public void update(String key, Funcionario typeClass) {
        DATABASE.put(key,typeClass);
    }

    @Override
    public void delete(String key) {
        DATABASE.remove(key);
    }
}
