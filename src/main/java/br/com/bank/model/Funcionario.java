package br.com.bank.model;

import java.util.Date;

public class Funcionario extends Pessoa {

	//TODO criar mais atributos
	private String matricula;
	private Cargo cargoEnum;
	private Double salario;
	private Date dataDeAdmissao;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Cargo getCargoEnum() {
		return cargoEnum;
	}

	public void setCargoEnum(Cargo cargoEnum) {
		this.cargoEnum = cargoEnum;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
}
