package com.sebas.RepasoParcial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.sebas.RepasoParcial.model.Person;
import com.sebas.RepasoParcial.repositories.PersonRepository;

@Scope("prototype")
@Service
public class PersonServiceImp implements PersonService{
	
	private PersonRepository pr;
	
	@Autowired
	public PersonServiceImp(PersonRepository pr) {
		this.pr = pr;
	}

	@Override
	public boolean addPerson(Person p) {
		if(p.getFirstName() != null && p.getLastName().trim() != "" &&
				p.getLastName() != null && p.getFirstName().trim() != "") {
			return pr.addPerson(p);
		}
		return false;
	}

	@Override
	public Person searchPerson(int id) {
		return pr.searchPerson(id);
	}

	@Override
	public boolean updatePerson(Person p) {
		if(p.getFirstName() != null && p.getLastName().trim() != "" &&
				p.getLastName() != null && p.getFirstName().trim() != "") {
			return pr.updatePerson(p);
		}
		return false;
	}

	@Override
	public Person deletePerson(int id) {
		return pr.deletePerson(id);
	}

}
