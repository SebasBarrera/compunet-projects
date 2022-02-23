package com.sebas.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactory implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		BeanDefinition beanNames = beanFactory.getBeanDefinition("myBeanY");
		
		//beanNames.getPropertyValues().setPropertyValueAt(beanNames.getPropertyValues().getPropertyValue(null), "nuevo valor");;

}}
