package com.sebas.lifecycle.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class myBeanY {

	
	private String stringProperty;
	
	public String mensaje() {
		return "Soy Bean Y";
	}



	public String getStringProperty() {
		return stringProperty;
	}



	public void setStringProperty(String stringProperty) {
		this.stringProperty = stringProperty;
	}
}
