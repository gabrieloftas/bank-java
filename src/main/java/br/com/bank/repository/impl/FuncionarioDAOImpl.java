package br.com.bank.repository.impl;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.bank.model.Funcionario;
import br.com.bank.repository.FuncionarioDAO;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private static final Map<String, Funcionario> DATABASE = new HashMap<>();


    @Override
    public void create(Funcionario typeClass) {
        DATABASE.put(typeClass.getCpf(), typeClass);
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
        if (DATABASE.containsKey(key)) {
            DATABASE.put(key, typeClass);
        } else throw new IllegalArgumentException();
    }

    @Override
    public void delete(String key) {
        if (DATABASE.remove(key) == null) {
            throw new IllegalArgumentException();
        }
    }
}
