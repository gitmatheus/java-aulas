package br.com.fiap.teste;

import static org.junit.Assert.fail;

import java.util.Calendar;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ConsultaDAO;
import br.com.fiap.dao.impl.ConsultaDAOImpl;
import br.com.fiap.entity.Consulta;
import br.com.fiap.entity.Medico;
import br.com.fiap.entity.Paciente;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	private static ConsultaDAO dao;

	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new ConsultaDAOImpl(em);
		
	}

	@Test
	void cadastrarTudoTest() {

		Paciente paciente = new Paciente("Thiago");
		Medico medico = new Medico(123,"Drauzio");
		Consulta consulta = new Consulta(medico,paciente,Calendar.getInstance(),"Rotina");
		
		try {
			
			dao.cadastrar(consulta);
			dao.commit();
		}catch(CommitException e) {
			e.printStackTrace();
			fail("falha no teste");
			
		}
		
	}

}
