package com.houssam.insertTest;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.houssam.modele.Person;
import com.houssam.service.PersonService;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

	@InjectMocks
	@Spy
	PersonService personService = new PersonService();
	
	@Test
	public void should_get_persons_by_id() throws Exception {
		Person per1 = new Person();
		per1.setId(1L);
		per1.setNom("Houssam");
		per1.setPrenom("GHAZALA");
		
		Mockito.doReturn(per1).when(personService).Personby(1L);
		
		Person person = personService.Personby(1L);
		
		Assertions.assertThat(person.getId()).isEqualTo(1L);
		Assertions.assertThat(person.getNom()).isEqualTo("Houssam");
		Assertions.assertThat(person.getPrenom()).isEqualTo("GHAZALA");
	}
}
