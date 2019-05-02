package br.com.testcontroller.entity;



public class ItemTeste {

	private int codigo;
	private String descricao;
	// private CasoTeste codCaso;

	public ItemTeste(int codigo, String descricao) {

		this.codigo = codigo;
		
		
		this.descricao = descricao;
	}

	public ItemTeste(String descricao) {

		this.descricao = descricao;
	}

	public ItemTeste() {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
