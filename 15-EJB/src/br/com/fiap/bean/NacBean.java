package br.com.fiap.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fiap.bo.NacBO;

@ManagedBean
@ViewScoped
public class NacBean {

	
	private double nac;
	
	private List<Double> lista;
	
	@EJB
	private NacBO bo;
	
	
	
	public void adicionar() {
		bo.adicionarNac(nac);
		lista = bo.pesquisar();
	}

	public double getNac() {
		return nac;
	}

	public void setNac(double nac) {
		this.nac = nac;
	}

	public List<Double> getLista() {
		return lista;
	}

	public void setLista(List<Double> lista) {
		this.lista = lista;
	}
	
	
	
}
