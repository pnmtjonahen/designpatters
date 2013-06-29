package nl.tjonahen;

/** 
 *  Dit is de director uit het pattern boek. De engineer bepaald de logica om middels een Machine iets te fabriceren.
 */
public class Engineer {

	private Machine machine;
	
	public Engineer(Machine machine) {
		this.machine = machine;
	}
	
	/**
	 * Dit is de business logica. 
	 */
	public void construct() {
		machine.buildFrame();
		machine.buildWheels();
		machine.buildEngine();
		machine.buildBody();
	}
}
