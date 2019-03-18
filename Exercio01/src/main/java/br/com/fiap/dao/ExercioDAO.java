package br.com.fiap.dao;

import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

public interface ExercioDAO {
	void cadastrar ();
	void atualizar ();
	void excluir (int codigo) throws CodigoInexistenteException;
	Object pesquisar (int codigo);
	void commit() throws CommitException;
	
}
