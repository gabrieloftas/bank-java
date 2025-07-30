package br.com.bank.model;

import java.util.Date;

public class Cliente extends Pessoa {

	//TODO criar mais atributos
	
	private Date dataInit;
	private Conta[] contas;
	private int score;
	private TipoCliente tipoClienteEnum;
	private boolean possibilidadeEmprestimo;


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

	public TipoCliente getTipoClienteEnum() {
		return tipoClienteEnum;
	}

	public void setTipoClienteEnum(TipoCliente tipoClienteEnum) {
		this.tipoClienteEnum = tipoClienteEnum;
	}

	@Override
	public String toString() {
		return getNome();
	}
}
