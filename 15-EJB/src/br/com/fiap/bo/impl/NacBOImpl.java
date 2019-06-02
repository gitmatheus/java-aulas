package br.com.fiap.bo.impl;



import java.util.List;
import java.util.ArrayList;

import javax.ejb.Singleton;
import javax.ejb.Stateful;

import br.com.fiap.bo.NacBO;

@Singleton
public class NacBOImpl implements NacBO {
	
	private List<Double> nacs = new ArrayList<Double>();

	
	public void adicionarNac(double nac) {
		nacs.add(nac);
		
	}

	
	public List<Double> pesquisar() {
		
		return nacs;
	}
	
	
	
	
	

}
