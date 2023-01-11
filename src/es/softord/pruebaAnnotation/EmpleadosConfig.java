package es.softord.pruebaAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.softord.pruebaAnnotation")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	
	//Definir el bean para InformeFinancieroDepCompras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDepCompras() { //Esto sera el nombre del Bean
		
		return new InformeFinancieroDepCompras();
		
	}
	
	//Definir bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDepCompras());  //El bean se ocupa aqui
	}

}
