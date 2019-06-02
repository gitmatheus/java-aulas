package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Carro extends Veiculo {

	@Column(name="nr_portas")
	private int numeroPotas;
	
	@Column(name="nr_roda")
	private int aroRoda;

	
	
	





	public Carro(double velocidade, String nome, int numeroPotas, int aroRoda) {
		super(velocidade, nome);
		this.numeroPotas = numeroPotas;
		this.aroRoda = aroRoda;
	}


	public int getNumeroPotas() {
		return numeroPotas;
	}


	public void setNumeroPotas(int numeroPotas) {
		this.numeroPotas = numeroPotas;
	}



	public int getAroRoda() {
		return aroRoda;
	}


	public void setAroRoda(int aroRoda) {
		this.aroRoda = aroRoda;
	}

}
