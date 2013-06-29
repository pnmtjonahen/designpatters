package nl.tjonahen.mediator;

import nl.tjonahen.colleagues.ColleagueA;
import nl.tjonahen.colleagues.ColleagueB;

public class MyMediator implements IMediator {
	private ColleagueA a;
	private ColleagueB b;

	public MyMediator() {
		a = new ColleagueA(this);
		b = new ColleagueB(this);
	}

	public void performAMethod() {
		System.out.println("AMethod called");
		a.perform();

	}

	public void performIBM() {
		b.perform();
	}

}
