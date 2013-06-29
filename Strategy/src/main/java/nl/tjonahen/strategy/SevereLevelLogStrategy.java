package nl.tjonahen.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SevereLevelLogStrategy implements IStrategy {

	public void out(String input) {
		Logger.getLogger(getClass().getName()).log(Level.SEVERE, input);
	}

}
