package br.com.bank.model;

import java.math.BigDecimal;

public class Poupanca extends Conta {
    private BigDecimal rendimento;

    public BigDecimal getRendimento() {
        return rendimento;
    }

    public void setRendimento(BigDecimal rendimento) {
        this.rendimento = rendimento;
    }

	@Override
	public String tipoConta() {
		return "CONTA POUPANÇA";
	}
}
