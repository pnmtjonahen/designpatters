package nl.tjonahen.colleagues;

import nl.tjonahen.mediator.IMediator;

public class ColleagueB {
	private IMediator mediator;

	public ColleagueB(IMediator mediator) {
		this.mediator = mediator;
	}


	public void perform() {
		System.out.println("Perform B en inform mediator");
		mediator.performAMethod();
	}
}
