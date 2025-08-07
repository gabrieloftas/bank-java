package br.com.bank.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.bank.model.Funcionario;
import br.com.bank.repository.FuncionarioDAO;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    private static Map<String,Funcionario> dataBase = new HashMap<>();

    @Override
    public void create(Funcionario funcionario) {
    	dataBase.put(funcionario.getMatricula(),funcionario); 
    }

    @Override
    public Funcionario get(String matricula) {
        return dataBase.get(matricula);
    }

    @Override
    public List<Funcionario> getAll() {
    	//TODO
        return List.of();
    }

    @Override
    public void update(String matricula, Funcionario funcionario) {
    	//TODO tratamento caso nao exista
        dataBase.put(matricula, funcionario);
    }

    @Override
    public void delete(String matricula) {
    	dataBase.remove(matricula);
    }
}
