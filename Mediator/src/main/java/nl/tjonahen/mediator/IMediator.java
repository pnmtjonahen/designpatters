package nl.tjonahen.mediator;
/**
 * Mediator.
 *
 * Definieert de mediator methode die door colleagues kunnen worden aangeroepen.
 *
 * De implementatie is niet echt duidelijk omdat de verschillende colleaques eigenlijk zoveel onafhankelijk moeten kunnen werken
 * De voorbeelden in het boek over een fontdialoog zijn denk ik dan ook duidelijker
 *
 *
 */
public interface IMediator {
	// A method
	public void performAMethod();
	// a Interesting Business Method
	public void performIBM();

}
