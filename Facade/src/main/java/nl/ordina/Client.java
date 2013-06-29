package nl.tjonahen;

import nl.tjonahen.subsystem.SubSystemA;
import nl.tjonahen.subsystem.SubSystemB;
import nl.tjonahen.subsystem.SubSystemC;

public class Client {

	public static void main(String[] args) {
		SubSystemA a = new SubSystemA();
		
		SubSystemB b = new SubSystemB();
		
		SubSystemC c = new SubSystemC();
		
		
		String result = a.performService();
		
		Double dResult = b.performService(result);
		
		c.performService(result, dResult);
	}
}
