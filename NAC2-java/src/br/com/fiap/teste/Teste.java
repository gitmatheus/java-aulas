package br.com.fiap.teste;

import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.LocacaoDAO;
import br.com.fiap.dao.impl.LocacaoDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Imovel;
import br.com.fiap.entity.Locacao;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

	private static LocacaoDAO dao;

	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new LocacaoDAOImpl(em);

	}

	@Test
	void cadastrarTudoTest() {
		
		Cliente cliente = new Cliente("Matheus", Genero.MASCULINO, new GregorianCalendar(1991,Calendar.MAY,26));
		Imovel imovel = new Imovel(null, "Boa lOcalização", "Rua nova",07725515);
		Locacao locacao = new Locacao(cliente, imovel, Calendar.getInstance(), 2000.00);
		
		
		

		try {

			dao.cadastrar(locacao);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("falha no teste");

		}

	}

}
