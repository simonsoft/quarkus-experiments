package se.simonsoft.experiment;

import javax.inject.Singleton;

@Singleton
public class ServiceCat extends ServiceAnimal {

	@Override
	public String getName() {
		return "cat";
	}
	
	

}
