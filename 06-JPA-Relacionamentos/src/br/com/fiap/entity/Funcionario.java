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
	
	
	
}
