package br.com.fiap.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="T_NAC_ENDERECO")
public class Endereco {
	
	@Id
	@Column(name="cd_imovel")
	@OneToOne
	private Imovel imovel;
	
	
	@Column(name="ds_logradouro",nullable=false,length=100)
	private String logradouro;
	
	
	@Column(name="nr_cep",nullable=false)
	private int cep;


	
	
	public Endereco(Imovel imovel, String logradouro, int cep) {
		super();
		this.imovel = imovel;
		this.logradouro = logradouro;
		this.cep = cep;
	}


	public Endereco() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Imovel getImovel() {
		return imovel;
	}


	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public int getCep() {
		return cep;
	}


	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
	
	
	
	
	

}
