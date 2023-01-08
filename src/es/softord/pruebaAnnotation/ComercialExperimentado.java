package es.softord.pruebaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
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
	private CreacionInformeFinanciero nuevoInformeFinanciero;

}
