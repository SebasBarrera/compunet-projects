package co.edu.icesi.ci.injectionexample1.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import co.edu.icesi.ci.injectionexample1.repositories.CourseRepository;
import co.edu.icesi.ci.injectionexample1.repositories.RegistrationRepository;
import co.edu.icesi.ci.injectionexample1.repositories.StudentRepository;
import co.edu.icesi.ci.injectionexample1.service.RegistrationService;
import co.edu.icesi.ci.injectionexample1.service.RegistrationServiceImp;

@SpringBootApplication
public class NoInjectionApplication {
	
	//

	public static void main(String[] args) {
		
		SpringApplication.run(NoInjectionApplication.class, args);
		//CommandLineRunner c = new 
		
		
	}
	
	/*@Bean
	public CommandLineRunner dummy(StudentRepository s, CourseRepository c, RegistrationRepository r) {
		return (args) -> {
			RegistrationService registration = new RegistrationServiceImp(s, c, r);
			registration.enrolStudent("11","101",192, "compunet");
		};
	}*/
	
	@Bean
	public CommandLineRunner dummy(RegistrationService r) {
		return (args) -> {
			r.enrolStudent("11","101",192, "compunet");
		};
	}
	
	

}

