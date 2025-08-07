package br.com.study.testes;

import br.com.bank.model.Agencia;
import br.com.bank.repository.AgenciaDAO;
import br.com.bank.repository.impl.AgenciaDAOImpl;

public class TesteTudo {

	public static void main(String[] args) {
		System.out.println("start object 1");
		AgenciaDAO dbAgencia = new AgenciaDAOImpl();
		Agencia ag1 = new Agencia("12456", "LISBOA");
		Agencia ag2 = new Agencia("12487", "FORTALEZA");
		
		dbAgencia.create(ag1);
		dbAgencia.create(ag2);
		
		/*dbAgencia.getAll().forEach(a -> {
			System.out.println(a.getNumeroAgencia());
		});*/
		System.out.println("end object 1");
		
		System.out.println("start object 2");
		AgenciaDAO dbAgencia2 = new AgenciaDAOImpl();
		Agencia ag3 = new Agencia("65477", "FORTALEZA");
		dbAgencia2.getAll().forEach(a -> {
			System.out.println(a.getNumeroAgencia());
		});
		dbAgencia2.create(ag3);
		System.out.println("end object 2");
		
		System.out.println("start object 3");
		AgenciaDAO dbAgencia3 = new AgenciaDAOImpl();
		dbAgencia3.getAll().forEach(a -> {
			System.out.println(a.getNumeroAgencia());
		});
		System.out.println("end object 3");
	}
	
}
