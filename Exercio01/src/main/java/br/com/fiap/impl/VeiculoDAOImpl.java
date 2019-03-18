package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ExercioDAO;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public class VeiculoDAOImpl implements ExercioDAO {

	
	private EntityManager em;
	
	
	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void cadastrar() {
		// TODO Auto-generated method stub

	}

	public void atualizar() {
		// TODO Auto-generated method stub

	}

	public void excluir(int codigo) throws CodigoInexistenteException {
		// TODO Auto-generated method stub

	}

	public Object pesquisar(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void commit() throws CommitException {
		// TODO Auto-generated method stub

	}

}
