package es.softord.pruebaAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leer y cargar el XML
		//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Leer el class de configuración
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		AnnotationConfigApplicationContext contexto1=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
					
		//Pedir un Bean
		//Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
		//Empleados Lucia=contexto.getBean("comercialExperimentado",Empleados.class);
						
		/*//Usar el Bean
		System.out.println(Antonio);
		System.out.println(Lucia);
		
		if(Antonio==Lucia) {
			System.out.println("Apuntan al mismo lugar de memoria");			
			System.out.println(Antonio+"\n"+Lucia);
		}else {
			System.out.println("No apuntan al mismo lugar de memoria");			
			System.out.println(Antonio+"\n"+Lucia);
		}
		
		System.out.println("Términa programa");
		*/
		
		
		//Pedir un bean al contenedor
		Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
		
		DirectorFinanciero director=contexto1.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println("Objeto de tipo Empleados");
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());
		
		System.out.println("\nObjeto de tipo DirectorFinanciero");
		System.out.println("Email del director: "+director.getEmail());
		System.out.println("Nombre de la empresa del director: "+director.getNombreEmpresa());
		
		//Cerrar el Contexto
		contexto.close();

	}

}
