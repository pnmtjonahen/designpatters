package nl.tjonahen.subsystem.facade;

import nl.tjonahen.subsystem.SubSystemA;
import nl.tjonahen.subsystem.SubSystemB;
import nl.tjonahen.subsystem.SubSystemC;

public class SubSystemFacade {
	public void performSubSystemServices() {
		
		SubSystemA a = new SubSystemA();
		
		SubSystemB b = new SubSystemB();
		
		SubSystemC c = new SubSystemC();
		
		
		String result = a.performService();
		
		Double dResult = b.performService(result);
		
		c.performService(result, dResult);
	}
}
