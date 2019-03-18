package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name= "T_PROJETO")
@SequenceGenerator(name = "projeto",sequenceName = "SQ_T_PROJETO", allocationSize = 1)
public class Projeto {
	
	@Id
	@Column(name = "cd_gerente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projeto")
	private int codigo;
	
	
	@Column(name = "nm_projeto", nullable = false, length = 30)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_status")
	private Status status;
	
	@Column(name = "dt_inicio", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;
	
	@Column(name = "dt_fim", nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar dataFim;

}
