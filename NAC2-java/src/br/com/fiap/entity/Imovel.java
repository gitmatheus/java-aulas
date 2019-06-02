package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SecondaryTable(name="T_NAC_ENDERECO", pkJoinColumns = {@PrimaryKeyJoinColumn(name="CD_IMOVEL")})
@SequenceGenerator(name="imovel",sequenceName="SQ_NAC_IMOVEL",allocationSize =1)
@Table(name="T_NAC_IMOVEL")
public class Imovel {

	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="imovel") 
	private int codigo;
	
	
	@Column(name="fl_foto")
	@Lob 
	private byte[] foto;
	
	
	@Column(name="ds_detalhes",nullable=false,length=500)
	private String detalhes;

	@OneToMany(mappedBy = "imovel", cascade=CascadeType.ALL)
	private List<Locacao> locacoes;
	
	
	@Column(name ="ds_logradouro", table="T_NAC_ENDERECO")
	private String logradouro;
	
	@Column(name ="nr_cep", table="T_NAC_ENDERECO")
	private int cep;
	

	public Imovel(int codigo, byte[] foto, String detalhes) {
		super();
		this.codigo = codigo;
		this.foto = foto;
		this.detalhes = detalhes;
	}


	public Imovel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getDetalhes() {
		return detalhes;
	}


	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

}
