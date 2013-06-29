package nl.tjonahen.colleagues;

import nl.tjonahen.mediator.IMediator;

public class ColleagueA {
	private IMediator mediator;

	public ColleagueA(IMediator mediator) {
		this.mediator = mediator;
	}


	public void perform() {
		System.out.println("Perform A");
	}

	public void IBM() {
		mediator.performIBM();
	}
}
