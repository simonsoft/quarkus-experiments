package se.simonsoft.experiment;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("cat")
public class ServiceCat extends ServiceAnimal {

	@Override
	public String getName() {
		return "cat";
	}
	
	

}
