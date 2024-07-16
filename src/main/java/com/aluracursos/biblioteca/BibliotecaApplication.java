package com.aluracursos.biblioteca;

import com.aluracursos.biblioteca.model.datosLibros;
import com.aluracursos.biblioteca.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi= new ConsumoAPI();

		var json = consumoApi.obtenerDatos("https://gutendex.com/books/?page=2");
		System.out.println(json);
		ConvierteDatos conversor= new ConvierteDatos();
		datosLibros datos = conversor.obtenerDatos(json, datosLibros.class);
		System.out.println(datos);
	}
}
