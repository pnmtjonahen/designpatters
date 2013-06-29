package nl.tjonahen;

import nl.tjonahen.subsystem.facade.SubSystemFacade;

public class Client2 {
	public static void main(String[] args) {
		SubSystemFacade f = new SubSystemFacade();
		f.performSubSystemServices();
	}
}
