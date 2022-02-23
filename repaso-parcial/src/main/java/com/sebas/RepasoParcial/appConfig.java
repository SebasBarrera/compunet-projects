package com.sebas.RepasoParcial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.sebas.RepasoParcial.repositories.PersonRepository;
import com.sebas.RepasoParcial.repositories.PersonRepositoryImp;
import com.sebas.RepasoParcial.services.PersonService;
import com.sebas.RepasoParcial.services.PersonServiceImp;

import lombok.extern.log4j.Log4j2;

//@Configuration
@Log4j2
public class appConfig {
	
	@Bean
	@Lazy
	public PersonRepository personRepository() {
		log.info("SE HA INICIALIZADO PERSON REPOSITORY");
		return new PersonRepositoryImp();
	}
	
	@Bean
	public PersonService personService() {
		return new PersonServiceImp(personRepository());
	}
}
