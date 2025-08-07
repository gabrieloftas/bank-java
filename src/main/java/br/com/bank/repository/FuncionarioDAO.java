package br.com.bank.repository;

import br.com.bank.model.Cliente;
import br.com.bank.model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {
    public void createFuncionario(Funcionario funcionario);
    public Funcionario getFuncionario(String matricula);
    public List<Funcionario> getAll();
    public void updateFuncionario(String matricula, Funcionario funcionario);
    public void deleteFuncionario(String matricula);
}
