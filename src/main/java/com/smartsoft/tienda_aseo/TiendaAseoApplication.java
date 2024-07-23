package com.smartsoft.tienda_aseo;

import com.smartsoft.tienda_aseo.modelos.cliente;
import com.smartsoft.tienda_aseo.modelos.producto;
import com.smartsoft.tienda_aseo.repository.clienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TiendaAseoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaAseoApplication.class, args);
	}
	@Bean
	//Metodo que se ejecuta al iniciar la app. Aqui se usa para darle valores de prueba al listado 'clientes'
	CommandLineRunner runner(clienteRepository clienteRepository){
		return args -> {

					List<cliente> clientes= Arrays.asList(
							new cliente("Edward", "gutierrez", "bogota","2022-13-05","311239855","edward@yahoo.com"),
							new cliente("Diana", "Guevara", "bogota","2018-13-05","3154897","diana@gmail.com"),
							new cliente("Juan", "Enrique", "Caldas","2002-13-05","31229545","juanEn@gmail.com")
					);
					clienteRepository.saveAll(clientes);

		};
	}
}

