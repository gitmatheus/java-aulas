package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(name = "veiculo", sequenceName = "SQL_T_VEICULO", allocationSize = 1)
public class Veiculo {
	
	
	
	@Id
	@Column(name = "cd_codigo")
	@GeneratedValue(generator = "veiculo", strategy = GenerationType.SEQUENCE )
	private int codigo;
	
	@Column(name = "ds_placa", length = 9, nullable = false)
	private String placa;
	
	@Column(name = "ds_cor", nullable = false, length = 20)
	private String cor;
	
	@Column(name = "nr_ano")
	private int ano;

	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veiculo(int codigo, String placa, String cor, int ano) {
		this.codigo = codigo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}
	
	public Veiculo(String placa, String cor, int ano) {
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	

}
