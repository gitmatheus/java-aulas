package br.com.fiap.entity;


import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista {
	
	
	@Id
	@Column(name = "nr_carteira")
	private int carteira;
	
	@Column(name = "nm_motorista", nullable = false, length= 150)
	private String motorista;
	
	@Column(name= "dt_nascimeto")
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	@Lob
	@Column(name = "fl_carteira")
	private byte[] fotoCarteira;
	
	@Column(name = "ds_genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorista(int carteira, String motorista, Calendar nascimento, byte[] fotoCarteira, Genero genero) {
	
		this.carteira = carteira;
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.fotoCarteira = fotoCarteira;
		this.genero = genero;
	}
	
	public Motorista(String motorista, Calendar nascimento, byte[] fotoCarteira, Genero genero) {
		
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.fotoCarteira = fotoCarteira;
		this.genero = genero;
	}
	
	
	
	

}
