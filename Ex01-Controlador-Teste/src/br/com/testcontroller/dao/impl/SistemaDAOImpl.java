package br.com.testcontroller.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.SistemaDAO;
import br.com.testcontroller.entity.Sistema;

public class SistemaDAOImpl extends GenericDAOImpl<Sistema, Integer>
							implements SistemaDAO{

	public SistemaDAOImpl(EntityManager em) {
		super(em);
	}
	
	
}
