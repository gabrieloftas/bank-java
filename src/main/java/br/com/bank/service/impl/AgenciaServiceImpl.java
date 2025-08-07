package br.com.bank.service.impl;

import br.com.bank.model.Agencia;
import br.com.bank.repository.AgenciaDAO;
import br.com.bank.repository.impl.AgenciaDAOImpl;
import br.com.bank.service.AgenciaService;

public class AgenciaServiceImpl implements AgenciaService {

	private AgenciaDAO dao = new AgenciaDAOImpl();
	
	@Override
	public void create(Agencia agencia) {
		if(agencia.getCidade() != null && agencia.getCidade().length() > 2) {
			dao.create(agencia);
		}else {
			throw new RuntimeException("Cidade is null");
		}
	}

	
}
