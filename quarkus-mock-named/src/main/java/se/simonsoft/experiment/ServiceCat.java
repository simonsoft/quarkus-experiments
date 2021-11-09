package se.simonsoft.experiment;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceCat extends ServiceAnimal {

	@Override
	public String getName() {
		return "cat";
	}
	
	

}
