package com.example.peticionesob;

import com.example.peticionesob.entities.Laptop;
import com.example.peticionesob.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PeticionesObApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PeticionesObApplication.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"FGkGDS","Lenovo", "ModeloPrueba");
		Laptop laptop2 = new Laptop(null,"FGkGDS","Lenovo", "ModeloPrueba2");

		repository.save(laptop1);
		repository.save(laptop2);

	}


}



