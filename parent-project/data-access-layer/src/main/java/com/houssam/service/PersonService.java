package com.houssam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssam.dao.IPersonDao;
import com.houssam.modele.Person;


@Service
public class PersonService implements IPersonService{

	public PersonService() {}

	@Autowired
	private IPersonDao personDao;
	
	public IPersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	public PersonService(IPersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public Person save(Person person) {
		return personDao.save(person);
	}

	@Override
	public Person Personby(Long id) {
		return personDao.by(id);
	}

}
