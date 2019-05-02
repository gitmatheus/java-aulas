package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> pesquisar();
	
	List<Cliente> pesquisar(String nome);
	
	List<Cliente> pesquisarPorEstado(String estado);
	
	List<Cliente> pesquisarPorDiaReserva(int dias);
	
	List<Cliente> pesquisar(String nome, String cidade);
	
	List<Cliente> perquisarPorEstados(List<String> estados);
	
	long contarPorEstado(String estado);
	
	Cliente pesquisarPorCpf(String cpf);
	
}