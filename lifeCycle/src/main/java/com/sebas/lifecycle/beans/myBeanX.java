package com.sebas.lifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class myBeanX implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization
	(Object bean, String beanName) 
			throws BeansException {
		if (!bean.getClass().toString().contains("springframework"))
			System.out.println("Mi Bean: " + beanName);
		return bean;
	}
	
	public String mensaje() {
		return "Soy Bean X";
	}
	
	@Override
	public Object postProcessAfterInitialization
	(Object bean, String beanName)
			throws BeansException {
		if (bean.getClass().toString().contains("springframework"))
			System.out.println("Bean de Spring: " + beanName);
		return bean;
	}
}
