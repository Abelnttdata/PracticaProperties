package com.example.springcoredojo;


import com.example.springcoredojo.autowired.Joke;
import com.example.springcoredojo.entidades.Jugador;
import com.example.springcoredojo.qualifer.Vehiculo;
import com.example.springcoredojo.qualifer.VehiculoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring2DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			Jugador jugador = ctx.getBean(Jugador.class);
			System.out.println(jugador);

			//LLamada al autowired
			Joke joke = ctx.getBean(Joke.class);
			System.out.println(joke.lineFromJoke());

			//Ejemplo  de @Qualifer
			VehiculoServicio vehiculoServicio = ctx.getBean(VehiculoServicio.class);
			System.out.println(vehiculoServicio.getClass().getName() + vehiculoServicio.getVehiculo().cantRuedas());
		};
	}

}
