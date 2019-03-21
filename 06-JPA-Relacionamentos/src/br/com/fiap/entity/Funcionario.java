package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name= "T_FUNCIONARIO")
@SequenceGenerator(name = "func",sequenceName = "SQ_T_FUNCIONARIO", allocationSize = 1)
public class Funcionario {

	@Id
	@Column(name = "cd_funcionario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "func")
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name="cd_departamento")
	private Departamento departamento;
	
	@Column(name = "nm_funcionario",nullable = false, length = 50)
	private String nome;
	
	@Column(name = "dt_nascimento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Column(name = "vl_salario", nullable = false)
	private float salario;
	
	
	

	public Funcionario(String nome, Calendar dataNascimento, float salario) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int codigo, Departamento departamento, String nome, Calendar dataNascimento, float salario) {
		super();
		this.codigo = codigo;
		this.departamento = departamento;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	

	
	
	
}
