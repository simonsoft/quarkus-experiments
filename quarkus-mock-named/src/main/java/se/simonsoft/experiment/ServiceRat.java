package se.simonsoft.experiment;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("rat")
public class ServiceRat extends ServiceAnimal {

	@Override
	public String getName() {
		return "rat";
	}
	
	

}
