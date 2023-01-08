package es.softord.pruebaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer y cargar el XML
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//Pedir un Bean
		Empleados Antonio=contexto.getBean("ComercialExperimentado",Empleados.class);
				
		//Usar el Bean
		System.out.println(Antonio.getInformes());
		System.out.println(Antonio.getTareas());
				
		//Cerrar el Contexto
		contexto.close();

	}

}
