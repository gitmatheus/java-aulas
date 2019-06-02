package br.com.fiap.bo;

import java.util.List;

import javax.ejb.Local;

@Local
public interface NacBO {
	
	void adicionarNac(double nac);
	
	
	List<Double> pesquisar();

}
