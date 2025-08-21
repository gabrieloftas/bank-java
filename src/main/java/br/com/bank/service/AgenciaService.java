package br.com.bank.service;

import br.com.bank.model.Agencia;

import java.util.List;

public interface AgenciaService {

	public void create(Agencia agencia);

    public Agencia get(String numeroAgencia);

    public List<Agencia> getAll();

    public void update(String numeroAgencia,Agencia agencia);

    public void delete(String numeroAgencia);


}
