package nl.tjonahen.context;

import nl.tjonahen.strategy.IStrategy;
/**
 * Strategy bepaald hoer er daadwerkelijk gelogged gaat worden
 *
 *
 */
public class Context {
	private IStrategy strategy;
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}


	public void ibm() {
	// voer wat uit, doe iets
		String msg = bepaalIBM();
    // voer de strategy uit
		strategy.out(msg);

	}


	private String bepaalIBM() {
		return "Een aanroep van de Interesante Business Methode.";
	}
}
