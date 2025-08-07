package br.com.bank.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.bank.model.Agencia;
import br.com.bank.repository.AgenciaDAO;

public class AgenciaDAOImpl implements AgenciaDAO {

	private static List<Agencia> dataBase = new ArrayList<>();
	
	@Override
	public void createAgencia(Agencia agencia) {
		dataBase.add(agencia);
	}

	@Override
	public Agencia getAgencia(String numeroAgencia) {
		/*
		for (int i=0;i< dataBase.size();i++){
			if (dataBase.get(i).getNumeroAgencia().equals(numeroAgencia)){
				return dataBase.get(i);
			}


		}
		*/
		Optional<Agencia> result = this.dataBase.stream().filter(a -> a.getNumeroAgencia().equals(numeroAgencia)).findFirst();
		if (result.isPresent()){
			return result.get();
		}
		return null;
	}

	@Override
	public List<Agencia> getAll() {
		return dataBase;
	}

	@Override
	public void updateAgencia(String numeroAgencia, Agencia agencia) {
		for (int i = 0; i < dataBase.size(); i++) {
			if (dataBase.get(i).getNumeroAgencia().equals(numeroAgencia)) {
				this.dataBase.set(i,agencia);
				break;
			}

		}
	}

	@Override
	public void deleteAgencia(String numeroAgencia) {
		for (int i = 0; i < dataBase.size(); i++) {
			if (dataBase.get(i).getNumeroAgencia().equals(numeroAgencia)) {
				this.dataBase.remove(i);
				break;

			}

		}
		
	}

}
