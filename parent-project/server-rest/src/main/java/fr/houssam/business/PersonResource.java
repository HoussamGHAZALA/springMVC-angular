package fr.houssam.business;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.houssam.modele.Person;
import com.houssam.service.IPersonService;

@RestController
@RequestMapping(value = "/resource")
public class PersonResource {

	private static Logger logger = Logger.getLogger(PersonResource.class);
	
	@Autowired
	private IPersonService personService;

	@RequestMapping(method = RequestMethod.GET)
	public String ping() {
		return "Resource disponible !!!";
	}

	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public Person getPerson(@PathVariable("id") Long id){
		logger.info("fetching person by id "+id);
		return personService.Personby(id);
	}
}
