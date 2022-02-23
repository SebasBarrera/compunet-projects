package com.sebas.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

import com.sebas.lifecycle.beans.myBeanX;
import com.sebas.lifecycle.beans.myBeanY;



@SpringBootApplication
@ComponentScan(basePackages = "com.sebas.lifecycle.beans")
public class LifeCycleApplication {
	
	@Lazy
	@Autowired
	myBeanY y;
	
	@Autowired
	myBeanX x;
	
	

	

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(LifeCycleApplication.class, args);
		LifeCycleApplication o = cac.getBean(LifeCycleApplication.class);
		System.out.println(o.y.getStringProperty());
		
	}
	
	
	
	

}
