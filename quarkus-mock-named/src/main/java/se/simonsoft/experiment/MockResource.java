package se.simonsoft.experiment;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/named")
public class MockResource {
	
	@Inject
	@Named("cat")
	ServiceAnimal service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.getName() + " - " + service.doSomething();
    }
}