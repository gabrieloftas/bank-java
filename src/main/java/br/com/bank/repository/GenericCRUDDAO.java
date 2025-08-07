package br.com.bank.repository;

import java.util.List;

public interface GenericCRUDDAO <T, K> {

	public void create(T typeClass);

	public T get(K key);

	public List<T> getAll();

	public void update(K key, T typeClass);

	public void delete(K key);
}
