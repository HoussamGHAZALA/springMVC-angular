package fr.houssam.business;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.Response.ok;
import static javax.ws.rs.core.Response.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.houssam.modele.Person;
import com.houssam.service.IPersonService;

@Path("resource")
@Service
public class PersonResource {

	@Autowired
	private IPersonService service;
	
	@GET
    public String doesItWorks() {
		return "Resource disponible !!!";
    }
	
	@GET
	@Path("/person")
	@Produces(APPLICATION_JSON + ";charset=utf-8")
    public Response personBy(@PathParam("id")Long id) {
		Person person = new Person(1L, "GHAZALA", "Houssam");//service.Personby(id);
		return buildResponse(person, "error");
    }
	
	private Response buildResponse(Object data, String errorMessage) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			String result = objectMapper.writeValueAsString(data);
			return ok(result).type(APPLICATION_JSON).build();
		} catch (JsonProcessingException exception) {
			return status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
		}
	}

}
