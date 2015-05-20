package fr.houssam.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.houssam.service.IPersonService;

@Controller
@RequestMapping(value = "/resource")
public class PersonResource {

	@Autowired
	private IPersonService service;
	
	@RequestMapping(method = RequestMethod.GET)
    public String doesItWorks() {
		return "Resource disponible !!!";
    }
	
//	@GET
//	@Path("/person")
//	@Produces(APPLICATION_JSON + ";charset=utf-8")
//    public Response personBy(@PathParam("id")Long id) {
//		Person person = new Person(1L, "GHAZALA", "Houssam");//service.Personby(id);
//		return buildResponse(person, "error");
//    }
	
//	private Response buildResponse(Object data, String errorMessage) {
//		try {
//			ObjectMapper objectMapper = new ObjectMapper();
//			String result = objectMapper.writeValueAsString(data);
//			return ok(result).type(APPLICATION_JSON).build();
//		} catch (JsonProcessingException exception) {
//			return status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
//		}
//	}

}
