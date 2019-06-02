package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_HER_VEICULO")
@SequenceGenerator(name="veiculo",sequenceName="SQ_T_HER_VEICULO", allocationSize=1)
public class Veiculo {
	
	@Id
	@Column(name="cd_veiculo")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "veiculo")
	private int codigo;
	
	
	@Column(name="vl_velocidade")
	private double velocidade;
	
	@Column(name="nm_veiculo")
	private String nome;
	
	
	public Veiculo(double velocidade, String nome) {
		this.velocidade = velocidade;
		this.nome = nome;
	}
	
	
	public Veiculo(int codigo, double velocidade, String nome) {
		super();
		this.codigo = codigo;
		this.velocidade = velocidade;
		this.nome = nome;
	}
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	

}
