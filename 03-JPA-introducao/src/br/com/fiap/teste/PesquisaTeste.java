package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class PesquisaTeste {

	public static void main(String[] args) {
		
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

		
		EntityManager em = fabrica.createEntityManager();
		
		
		
		//Pesquisa um cliente com c�digo 1
		Cliente cliente = em.find(Cliente.class, 2);
		
		System.out.println(cliente.getNome());
		
		cliente.setNome("Jo�o");
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		em.clear();
		fabrica.close();
		
		
		
		

	}

}
