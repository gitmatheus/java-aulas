package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class AtualizaTeste {

	public static void main(String[] args) {
	
		EntityManagerFactory frabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em =  frabrica.createEntityManager();
		
		//Atualiza um cliente
		//Instaciar um cliente com um Id que existe no Banco
		
		Cliente cliente = new Cliente(2, "Lula", new GregorianCalendar(2002,Calendar.JANUARY,22), "987.654.321.77", Genero.MASCULINO, null, true);
		
		em.merge(cliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		frabrica.close();
		

	}

}
