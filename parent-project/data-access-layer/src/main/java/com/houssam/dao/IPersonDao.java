package com.houssam.dao;

import com.houssam.modele.Person;

public interface IPersonDao{
	Person save(Person person);
	Person by(Long id);
}
