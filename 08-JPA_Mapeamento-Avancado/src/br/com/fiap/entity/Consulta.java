package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_MA_CONSULTA")
@IdClass(ConsultaPK.class)
public class Consulta {

	
	@Id
	@Column(name = "cd_consulta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consulta")
	@SequenceGenerator(name ="consulta",sequenceName="SQ_T_CONSULTA", allocationSize =1)
	private int codigo;
	
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="nr_crm")
	private Medico medico;
	@Id
	@ManyToOne
	@JoinColumn(name="cd_paciente")
	private Paciente paciente;
	
	@Column(name="dt_consulta")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@Column(name="ds_tipo")
	private String tipo;

	
	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	
	public Consulta( Medico medico, Paciente paciente, Calendar data, String tipo) {
		
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
		this.tipo = tipo;
	}

	public Consulta(int codigo, Medico medico, Paciente paciente, Calendar data, String tipo) {
		super();
		this.codigo = codigo;
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
		this.tipo = tipo;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
	
	
	
	
}
