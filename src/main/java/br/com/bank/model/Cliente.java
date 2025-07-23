package br.com.bank.model;

import java.util.Date;

public class Cliente extends Pessoa {

	//TODO criar mais atributos
	
	private Date dataInit;
	private Conta[] contas;
	private int score;
	private Enum<TipoCliente> tipoClienteEnum;


	public Date getDataInit() {
		return dataInit;
	}

	public void setDataInit(Date dataInit) {
		this.dataInit = dataInit;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Enum<TipoCliente> getTipoClienteEnum() {
		return tipoClienteEnum;
	}

	public void setTipoClienteEnum(Enum<TipoCliente> tipoClienteEnum) {
		this.tipoClienteEnum = tipoClienteEnum;
	}
}
