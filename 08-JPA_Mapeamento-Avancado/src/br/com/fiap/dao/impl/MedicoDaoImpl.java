package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.MedicoDAO;
import br.com.fiap.entity.Medico;

public class MedicoDaoImpl extends GenericDAOImpl<Medico, Integer> implements MedicoDAO {

	public MedicoDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
