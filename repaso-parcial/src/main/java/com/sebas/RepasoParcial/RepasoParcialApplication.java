package com.sebas.RepasoParcial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.sebas.RepasoParcial.model.Person;
import com.sebas.RepasoParcial.repositories.PersonRepository;
import com.sebas.RepasoParcial.repositories.PersonRepositoryImp;
import com.sebas.RepasoParcial.services.PersonService;

import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
//@ComponentScan(basePackages = "com.sebas.RepasoParcial")
public class RepasoParcialApplication {
	
	

	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(RepasoParcialApplication.class, args);
		RepasoParcialApplication app = c.getBean(RepasoParcialApplication.class);
		PersonService service = c.getBean(PersonService.class);
		PersonRepository repo = c.getBean(PersonRepository.class);
		service.addPerson(new Person(1, "Juan", "Barrera"));
		log.info("El bean de persona: " + service.searchPerson(1).getFirstName() + " " + service.searchPerson(1).getLastName() + " ha sido creado");
		service.addPerson(new Person(2, "Sebastian", "Pulido"));
		log.info("El bean de persona: " + service.searchPerson(2).getFirstName() + " " + service.searchPerson(2).getLastName() + " ha sido creado");
		service.deletePerson(1);
		service.deletePerson(2);
		if(service.searchPerson(1) == null) {
			log.info("La persona con el id 1 ha sido eliminada");
		} else {
			log.info("TODO FALLLAAAAAAAAA 1");
		}
		if(service.searchPerson(2) == null) {
			log.info("La persona con el id 2 ha sido eliminada");
		} else {
			log.info("TODO FALLLAAAAAAAAA 2");
		}
	}
	/*
	@Bean
	public CommandLineRunner xd(PersonService ps) {
		return (args) -> {
			ps.addPerson(new Person(1, "Juan", "Barrera"));
			ps.addPerson(new Person(2, "Sebastian", "Pulido"));
			log.info("El bean de persona: " + ps.searchPerson(1).getFirstName() + " " + ps.searchPerson(1).getLastName() + " ha sido creado");
			log.info("El bean de persona: " + ps.searchPerson(2).getFirstName() + " " + ps.searchPerson(2).getLastName() + " ha sido creado");
			ps.deletePerson(1);
			ps.deletePerson(2);
			if(ps.searchPerson(1) == null) {
				log.info("La persona con el id 1 ha sido eliminada");
			} else {
				log.info("TODO FALLLAAAAAAAAA 1");
			}
			if(ps.searchPerson(2) == null) {
				log.info("La persona con el id 2 ha sido eliminada");
			} else {
				log.info("TODO FALLLAAAAAAAAA 2");
			}
		};
	}
*/
}
