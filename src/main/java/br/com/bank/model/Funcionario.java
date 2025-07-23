package br.com.bank.model;

import java.util.Date;

public class Funcionario extends Pessoa {

	//TODO criar mais atributos
	private String matricula;
	private Enum<Cargo> cargoEnum;
	private Double salario;
	private Date dataDeAdmissao;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Enum<Cargo> getCargoEnum() {
		return cargoEnum;
	}

	public void setCargoEnum(Enum<Cargo> cargoEnum) {
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
