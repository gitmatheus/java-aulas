package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class CadastroTeste {

	public static void main(String[] args) {
		// Criar um gerenciador de entidades
		// Primeiro cria a fábrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		// Depois, a fabrica cria os Entity Manager
		EntityManager em = fabrica.createEntityManager();

		//instanciar o cliente	
		Cliente cliente = new Cliente("matheus", new GregorianCalendar(1991,Calendar.MARCH,2), "cpf", Genero.MASCULINO, null, true);
		
		em.persist(cliente);
		
		//Abre uma transação e finaliza com commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();

	}

}
