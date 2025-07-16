package br.com.study.testes;

import br.com.bank.model.Pessoa;

public class TesteTudo {

	public static void main(String[] args) {
		TesteFinalStatic testes = new TesteFinalStatic();
		
		testes.nome = "Antonio";
		
		TesteFinalStatic testes2 = new TesteFinalStatic();
		
		testes2.nome = "Gabriel";
		
		TesteFinalStatic.nome = "Serra";
		
		System.out.println(testes.nome);
		System.out.println(testes2.nome);
		
		
		
	}
	
}
