package nl.tjonahen.template;

public class PreProcess extends ProcessTemplate {


	@Override
	protected void preProcess() {
		System.out.println("Uitvoeren van het preProcess");

	}

	@Override
	protected void process() {
		System.out.println("Uitvoeren van het process");

	}

}
