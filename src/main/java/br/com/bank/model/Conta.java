package br.com.bank.model;

import java.math.BigDecimal;

public abstract class Conta {
    private String NumeroConta;
    private String cpfCliente;
    private BigDecimal saldo;
    private String numeroAgencia;
    private String cpfGerenteAssociadoConta;

    public String getCpfGerenteAssociadoConta() {
        return cpfGerenteAssociadoConta;
    }

    public void setCpfGerenteAssociadoConta(String cpfGerenteAssociadoConta) {
        this.cpfGerenteAssociadoConta = cpfGerenteAssociadoConta;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public Conta(){}

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }



    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}
