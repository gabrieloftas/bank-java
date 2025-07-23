package br.com.bank.repository;

import java.util.List;

import br.com.bank.model.Agencia;

public interface AgenciaDAO {

	public void createAgencia(Agencia agencia);

	public Agencia getAgencia(String numeroAgencia);

	public List<Agencia> getAll();

	public void updateAgencia(String numeroAgencia, Agencia agencia);

	public void deleteAgencia(String numeroAgencia);
}
