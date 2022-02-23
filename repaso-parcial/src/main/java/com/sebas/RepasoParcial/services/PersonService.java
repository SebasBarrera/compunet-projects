package com.sebas.RepasoParcial.services;

import com.sebas.RepasoParcial.model.Person;

public interface PersonService {
	public boolean addPerson(Person p);
	public Person searchPerson(int id);
	public boolean updatePerson(Person p);
	public Person deletePerson(int id);
}
