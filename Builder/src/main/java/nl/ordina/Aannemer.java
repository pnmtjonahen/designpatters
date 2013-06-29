package nl.tjonahen;


/**
 * Director classe in het builder pattern. Deze stuurt de builder aan in een bepaalde volgorde om te builden.
 *
 */

public class Aannemer {
	private GebouwenBuilder builder;
	
	public Aannemer(GebouwenBuilder builder) {
		this.builder = builder;
	}
	public void construct() {
		builder.buildGebouw();
		builder.buildKamer(0,1);
		builder.buildKamer(0,2);
		builder.buildKamer(0,3);
		builder.buildKamer(0,4);

		builder.buildVerdieping(1);
		builder.buildTrap(0,1);
		builder.buildKamer(1,5);
		builder.buildKamer(1,6);
		builder.buildKamer(1,7);
		builder.buildKamer(1,8);

		builder.buildVerdieping(2);
		builder.buildTrap(1,2);
		builder.buildKamer(2,10);
		builder.buildKamer(2,11);
		builder.buildKamer(2,12);
		builder.buildKamer(2,13);
		
		builder.buildVerdieping(3);
		builder.buildKamer(3,14);
		builder.buildKamer(3,15);
		builder.buildKamer(3,16);
		builder.buildKamer(3,17);

	}
	public IGebouw createGebouw(GebouwenBuilder builder) {
		builder.buildGebouw();
		builder.buildKamer(0,1);
		builder.buildKamer(0,2);
		builder.buildKamer(0,3);
		builder.buildKamer(0,4);

		return builder.getGebouw();
	}

}
