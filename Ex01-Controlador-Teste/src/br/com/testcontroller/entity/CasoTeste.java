package br.com.testcontroller.entity;

public class CasoTeste {

	private int codigo;

	private String nome;

	private String descricao;

	// private Sistema codSistema;

	public CasoTeste(int codigo, String nome, String descricao) {

		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public CasoTeste(String nome, String descricao) {

		this.nome = nome;
		this.descricao = descricao;
	}

	public CasoTeste() {

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
