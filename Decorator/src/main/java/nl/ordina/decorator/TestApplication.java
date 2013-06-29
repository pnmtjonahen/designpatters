package nl.tjonahen.decorator;


public class TestApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		draw(new TextView());
		
		draw(new ScrollDecorator(new TextView()));
		
		draw(new BorderDecorator(new ScrollDecorator(new TextView())));
		
//		BorderDecorator bd = new BorderDecorator();
//		ScrollDecorator sd = new ScrollDecorator();
//		TextView tv = new TextView();
//		
//		bd.setNextComponent(sd);
//		sd.setNextComponent(tv);
	}

	private static void draw(VisualComponent vc) {
		vc.draw();
	}

}
