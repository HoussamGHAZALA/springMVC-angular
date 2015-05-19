package com.houssam.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.houssam.modele.Person;
import com.houssam.repository.PersonRepository;

@Component
public class PersonDao implements IPersonDao{

	@Autowired
	private PersonRepository personRepository;
	
	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person by(Long id) {
		return personRepository.findOne(id);
	}
}
