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

@Table(name="T_NAC_LOCACAO")
@IdClass(LocacaoPK.class)
public class Locacao {
	
	@Id
	@SequenceGenerator(name="locacao",sequenceName="SQ_NAC_LOCACAO",allocationSize =1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="locacao") 
	@Column(name="cd_locacao")
	private int codigo;
	
	
	@ManyToOne 
	@JoinColumn(name="cd_cliente") 
	private Cliente cliente;
	
	@ManyToOne 
	@JoinColumn(name="cd_imovel") 
	private Imovel imovel;
	
	@Column(name="dt_locacao", nullable=false)
	@Temporal(value=TemporalType.DATE) 
	private Calendar dataLocacao;
	
	@Column(name="vl_locacao", nullable=false)
	private Double valor;
	
	
	
	

	public Locacao(int codigo, Cliente cliente, Imovel imovel, Calendar dataLocacao, Double valor) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.imovel = imovel;
		this.dataLocacao = dataLocacao;
		this.valor = valor;
	}

	public Locacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public Calendar getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Calendar dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	

}
