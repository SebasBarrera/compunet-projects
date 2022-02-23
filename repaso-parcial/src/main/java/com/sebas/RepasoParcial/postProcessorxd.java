package com.sebas.RepasoParcial;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;
@Component
@Log4j2
public class postProcessorxd implements BeanPostProcessor {
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().toString().contains("PersonServiceImp")) log.info("CHAOOOO, soy un bean de PersonSearvice"); 
		return bean;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().toString().contains("PersonServiceImp")) log.info("HOLAAA, soy un bean de PersonSearvice"); 
		return bean;
	}
}
