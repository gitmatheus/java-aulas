package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Barco extends Veiculo {
	
	@Column(name="nr_pes")
	private Double pes;
	
	@Column(name="ds_tipo_barco")
	private TipoBarco tipo;
	
	



	public Barco(double velocidade, String nome, Double pes, TipoBarco tipo) {
		super(velocidade, nome);
		this.pes = pes;
		this.tipo = tipo;
	}

	public Double getPes() {
		return pes;
	}

	public void setPes(Double pes) {
		this.pes = pes;
	}

	public TipoBarco getTipo() {
		return tipo;
	}

	public void setTipo(TipoBarco tipo) {
		this.tipo = tipo;
	}
	
	
	
}
