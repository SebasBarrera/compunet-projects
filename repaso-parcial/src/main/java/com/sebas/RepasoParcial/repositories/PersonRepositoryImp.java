package com.sebas.RepasoParcial.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.sebas.RepasoParcial.model.Person;
@Repository
public class PersonRepositoryImp implements PersonRepository {
	
	private ArrayList<Person> persons;

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}
	
	public PersonRepositoryImp() {
		persons = new ArrayList<Person>();
	}

	@Override
	public boolean addPerson(Person p) {
		
			persons.add(p);
			return true;
		
	}

	@Override
	public Person searchPerson(int id) {
		for (Person p : persons) {
			if ( p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	@Override
	public boolean updatePerson(Person p) {
		Person aux = searchPerson(p.getId());
		deletePerson(aux.getId());
		addPerson(p);
		return true;
	}

	@Override
	public Person deletePerson(int id) {
		Person deleted = searchPerson(id);
		persons.remove(deleted);
		return deleted;
	}
	

}
