package br.com.bank.model;

public class Corrente extends Conta{
    private boolean emprestimoAssociado;

    public boolean isEmprestimoAssociado() {
        return emprestimoAssociado;
    }

    public void setEmprestimoAssociado(boolean emprestimoAssociado) {
        this.emprestimoAssociado = emprestimoAssociado;
    }
}
