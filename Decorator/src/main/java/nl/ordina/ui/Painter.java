package nl.tjonahen.ui;

public class Painter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		schilder(new Window());
		
		schilder(new Kozijn(new Window()));
		
		schilder(new Kozijn(new Kozijn(new Window())));
		

	}

	private static void schilder(Paint p) {
		p.paint();
	}
}
