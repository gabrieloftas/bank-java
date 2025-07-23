package br.com.study.testes;

import br.com.bank.model.Agencia;
import br.com.bank.repository.AgenciaDAO;
import br.com.bank.repository.impl.AgenciaDAOImpl;

public class TesteTudo {

	public static void main(String[] args) {
		AgenciaDAO dbAgencia = new AgenciaDAOImpl();
		Agencia ag1 = new Agencia("12456", "LISBOA");
		Agencia ag2 = new Agencia("12487", "FORTALEZA");
		
		dbAgencia.createAgencia(ag1);
		dbAgencia.createAgencia(ag2);
		
		/*dbAgencia.getAll().forEach(a -> {
			System.out.println(a.getNumeroAgencia());
		});*/
		
		
		AgenciaDAO dbAgencia2 = new AgenciaDAOImpl();
		//TODO resolve isso
		dbAgencia2.getAll().forEach(a -> {
			System.out.println(a.getNumeroAgencia());
		});
	}
	
}
