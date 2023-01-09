package es.softord.pruebaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer y cargar el XML
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
					
		//Pedir un Bean
		Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
		Empleados Lucia=contexto.getBean("comercialExperimentado",Empleados.class);
						
		//Usar el Bean
		System.out.println(Antonio);
		System.out.println(Lucia);
		
		if(Antonio==Lucia) {
			System.out.println("Apuntan al mismo lugar de memoria");			
			System.out.println(Antonio+"\n"+Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar de memoria");			
			System.out.println(Antonio+"\n"+Lucia);
		}
						
		//Cerrar el Contexto
		contexto.close();

	}

}
