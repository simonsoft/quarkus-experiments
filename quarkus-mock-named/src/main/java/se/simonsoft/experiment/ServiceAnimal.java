package se.simonsoft.experiment;


public abstract class ServiceAnimal {

	public /*final*/ String doSomething() {
		throw new IllegalStateException("Unable to communicate with paw service.");
	}
	
	public abstract String getName();
	
}
