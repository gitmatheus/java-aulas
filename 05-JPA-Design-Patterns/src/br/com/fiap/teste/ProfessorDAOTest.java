package br.com.fiap.teste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ProfessorDAO;
import br.com.fiap.dao.impl.ProfessorDAOImpl;
import br.com.fiap.entity.Professor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

class ProfessorDAOTest {

	private static ProfessorDAO dao;
	private Professor professor ;
	
	//método que será executado antes de cada teste
	@BeforeEach
	public void antesTest() {
		//cadastrar
		professor = new Professor("Astoufo", null, "45678913");
		try {
			dao.cadastrar(professor);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}
	
	// método que será executado antes de todos os testes
	@BeforeAll
	public static void inicializar() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();
		dao = new ProfessorDAOImpl(em);
		//fail("Falha no Teste");
	}

	@Test
	@DisplayName("Teste de cadastro de professor com sucesso")
	void cadastroTest() {
		// Arrange - Instaciar os objetos
		professor = new Professor("Astoufo", null, "45678913");
		try {
			dao.cadastrar(professor);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}
		// assert - validar o resultado
		// valida se foi gerado um codigo pela sequencia
		assertNotEquals(0, professor.getCodigo());
	}

	@Test
	@DisplayName("Teste de atualização de professor com sucesso")
	void atualizaTest() {
		Professor professor = new Professor("Prof", null, "45678913");
		// Cadastra um professor
		try {
			dao.cadastrar(professor);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}

		// Atualiza um professor
		Professor profe2 = new Professor(professor.getCodigo(), "Prof2", null, "45674");
		try {
			dao.atualizar(profe2);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}

		try {
			Professor prof3 = dao.pesquisar(professor.getCodigo());
			assertEquals("Prof2", prof3.getNome());
			assertEquals("45674", prof3.getCpf());

		} catch (CodigoInexistenteException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}

	}
	
	@Test
	@DisplayName("Teste de pesquisa de professor com sucesso")
	void pesquisaTest() {
		try {
			Professor busca = dao.pesquisar(professor.getCodigo());
			//Assert - Validar
			assertNotNull(busca);
			//encontrou alguem
			assertEquals(busca.getNome(), professor.getNome()); // encontrou o certo
		} catch (CodigoInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Erro na pesquisa");
		}	
		
	}
	
	
	@Test
	@DisplayName("Teste de remoção de professor com sucesso")
	void removeTest() {
		
		try {
			dao.excluir(professor.getCodigo());
			dao.commit();
		} catch (CodigoInexistenteException | CommitException e) {
			e.printStackTrace();
			fail("Falha no Teste");
		}
		
		//pesquisa professor
		
		assertThrows(CodigoInexistenteException.class, ()-> dao.pesquisar(professor.getCodigo()));
		
//		try {
//			Professor pesquisa = dao.pesquisar(professor.getCodigo());
//			fail("Erro no Teste");
//
//		} catch (CodigoInexistenteException e) {
//			//Sucesso
//		}
		
		
	}
	

}
