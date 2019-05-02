package br.com.testcontroller.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.UsuarioDAO;
import br.com.testcontroller.entity.Usuario;

public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> 
							implements UsuarioDAO{

	public UsuarioDAOImpl(EntityManager em) {
		super(em);
	}
	
}
