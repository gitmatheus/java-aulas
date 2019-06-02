package br.com.fiap.main;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.fiap.bo.DisciplinaBO;

public class View {

	public static void main(String[] args) throws Exception {
		
		
		Properties prop = new Properties(); 
		
		prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		
		Context context = new InitialContext(prop);
		
		DisciplinaBO bo = (DisciplinaBO) context.lookup("ejb:/15-EJB/DisciplinaBOImpl!br.com.fiap.bo.DisciplinaBO");
		
		System.out.println(bo.calcularMedia(8,8, 6));
		
		
	}
	
	
}
