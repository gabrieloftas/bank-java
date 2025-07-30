package br.com.bank.model;

public class Agencia {
    private String numeroAgencia;
    private String cidade;
    
    public Agencia() {
	}
    
    public Agencia(String numeroAgencia, String cidade) {
    	this.numeroAgencia = numeroAgencia;
    	this.cidade = cidade;
	}
    
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
    
}
