package es.softord.pruebaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInformeFinanciero) {
		this.nuevoInformeFinanciero = nuevoInformeFinanciero;
	}

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
	private CreacionInformeFinanciero nuevoInformeFinanciero;

}
