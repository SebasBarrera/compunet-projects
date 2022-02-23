package com.sebas.RepasoParcial.repositories;

import com.sebas.RepasoParcial.model.Person;

public interface PersonRepository {
	public boolean addPerson(Person p);
	public Person searchPerson(int id);
	public boolean updatePerson(Person p);
	public Person deletePerson(int id);
}
