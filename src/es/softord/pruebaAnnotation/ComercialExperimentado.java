package es.softord.pruebaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  //@Scope("singleton")
public class ComercialExperimentado implements Empleados {
	
	//Ejecución de código despues de creación de Bean
	@Bean(initMethod ="init")
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creación del Bean");
	}
	
	//Ejecución de código despues de apagado contenedor Bean
	@Bean(destroyMethod="destroy")
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrucción");
	}
	
	public ComercialExperimentado() {
	
	}
	
	/*@Autowired //Inyección con constructor
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInformeFinanciero) {
		this.nuevoInformeFinanciero = nuevoInformeFinanciero;
	}*/
	
	/*@Autowired
	public void setQueMasDaElNombre(CreacionInformeFinanciero nuevoInformeFinanciero) {
		this.nuevoInformeFinanciero=nuevoInformeFinanciero;
	}*/

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
	
	//Crear objeto de la interfaz
	@Autowired
	@Qualifier("informeFinancieroTrim4") //Bean que debe utilizar
	private CreacionInformeFinanciero nuevoInformeFinanciero;

}
