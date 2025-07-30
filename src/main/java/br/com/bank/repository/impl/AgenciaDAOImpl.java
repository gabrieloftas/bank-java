package br.com.bank.repository.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.bank.model.Agencia;
import br.com.bank.repository.AgenciaDAO;

public class AgenciaDAOImpl implements AgenciaDAO {

	List<Agencia> dataBase = new ArrayList<>();
	
	@Override
	public void createAgencia(Agencia agencia) {
		dataBase.add(agencia);
	}

	@Override
	public Agencia getAgencia(String numeroAgencia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agencia> getAll() {
		return dataBase;
	}

	@Override
	public void updateAgencia(String numeroAgencia, Agencia agencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAgencia(String numeroAgencia) {
		// TODO Auto-generated method stub
		
	}

}
