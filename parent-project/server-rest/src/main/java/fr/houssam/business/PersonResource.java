package fr.houssam.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.houssam.modele.Person;
import com.houssam.service.IPersonService;

@RestController
@RequestMapping(value = "/resource")
public class PersonResource {

	@Autowired
	private IPersonService service;

	@RequestMapping(method = RequestMethod.GET)
	public String doesItWorks() {
		return "Resource disponible !!!";
	}

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String getPerson(Long id){
		Person person = new Person(id, "GHAZALA", "Houssam");
		ObjectMapper mapper = new ObjectMapper();
		String personJson = ""; 
	    try {
			personJson =  mapper.writeValueAsString(person);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return personJson;		
	}
}
