package co.edu.icesi.ci.injectionexample1.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import co.edu.icesi.ci.injectionexample1.repositories.CourseRepository;
import co.edu.icesi.ci.injectionexample1.repositories.CourseRepositoryImp;
import co.edu.icesi.ci.injectionexample1.repositories.RegistrationRepository;
import co.edu.icesi.ci.injectionexample1.repositories.RegistrationRepositoryImp;
import co.edu.icesi.ci.injectionexample1.repositories.StudentRepository;
import co.edu.icesi.ci.injectionexample1.repositories.StudentRepositoryImp;
import co.edu.icesi.ci.injectionexample1.service.RegistrationService;
import co.edu.icesi.ci.injectionexample1.service.RegistrationServiceImp;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "co.edu.icesi.ci.injectionexample1")
public class AppConfig {
	@Bean
	public RegistrationService registrationService() {
		return new RegistrationServiceImp(studentRepository(), courseRepository(), registrationRepository());
	}
	@Bean
	public RegistrationRepository registrationRepository() {
		return new RegistrationRepositoryImp();
	}
	@Bean
	public CourseRepository courseRepository() {
		return new CourseRepositoryImp();
	}
	@Bean
	public StudentRepository studentRepository() {
		return new StudentRepositoryImp();
	}
	
}
