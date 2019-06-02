package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="cliente",sequenceName="SQ_NAC_CLIENTE",allocationSize =1)
@Table(name="T_NAC_CLIENTE")
public class Cliente {
	
	@Id
	@Column(name="cd_cliente", nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente") 
	private int codigo;
	
	@Column(name="nm_cliente",length=50)
	private String nome;
	
	@Column(name="ds_genero")
	private Genero genero;
	
	@Column(name="dt_nascimento")
	@Temporal(value=TemporalType.DATE) 
	private Calendar dtNascimento;
	
	@OneToMany(mappedBy = "cliente", cascade=CascadeType.ALL)
	private List<Locacao> locacoes;
	

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	public Cliente(int codigo, String nome, Genero genero, Calendar dtNascimento) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.dtNascimento = dtNascimento;
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Locacao> getLocacoes() {
		return locacoes;
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
	
	
	

}
