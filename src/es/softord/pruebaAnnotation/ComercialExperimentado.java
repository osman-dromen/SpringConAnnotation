package es.softord.pruebaAnnotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //@Scope("singleton")
public class ComercialExperimentado implements Empleados, InitializingBean, DisposableBean {
	
	/*@Autowired //Inyección con constructor
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInformeFinanciero) {
		this.nuevoInformeFinanciero = nuevoInformeFinanciero;
	}
	
	@Autowired //Inyección con un settter
	public void setQueMasDaElNombre(CreacionInformeFinanciero nuevoInformeFinanciero) {
		this.nuevoInformeFinanciero=nuevoInformeFinanciero;
	}
	*/
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, Vender, Vender y vender más";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "Informe generado por el Comercial";
		
		return nuevoInformeFinanciero.getInformeFinanciero();
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando tras la creación del Bean");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejecutando antes de la destrucción del Bean");
	}
	
	//Crear objeto de la interfaz
	@Autowired
	@Qualifier("informeFinancieroTrim4") //Bean que debe utilizar
	private CreacionInformeFinanciero nuevoInformeFinanciero;

}
