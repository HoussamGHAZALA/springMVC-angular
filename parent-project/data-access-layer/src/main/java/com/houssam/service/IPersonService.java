package com.houssam.service;

import com.houssam.modele.Person;

public interface IPersonService {
	Person save(Person person);
	Person Personby(Long id);
}
