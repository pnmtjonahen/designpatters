package nl.tjonahen.template;

abstract public class ProcessTemplate {


	public void templateMethod() {
		preProcess();
		process();
		postProcess();
	}

	protected void preProcess() {

	}
	abstract protected void process();

	protected void postProcess() {

	}

}
