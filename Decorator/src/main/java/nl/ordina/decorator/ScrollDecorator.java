package nl.tjonahen.decorator;

public class ScrollDecorator extends Decorator {
		public void draw() {
			super.draw();
			scrollDraw();
		}
		
		private void scrollDraw() {
			System.out.println(getClass().getName() + "->scrollDraw");
		}
		
		public ScrollDecorator(VisualComponent next) {
			super(next);
		}
}
