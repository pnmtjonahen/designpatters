package nl.tjonahen;


/**
 * Builder.
 * Deze abstracte classe bepaald war er gebouwd kan worden. Hoe dit gebouwd word en of er iets gebouwd wordt is afhankelijk van
 * de concrete builder classe.
 *
 *
 *
 */
abstract public class GebouwenBuilder {
	protected IGebouw gebouw;

	public final IGebouw getGebouw() {
		return gebouw;
	}

	public void buildGebouw() { }
	public void buildVerdieping(int verdieping) {}
	public void buildKamer(int opVerdieping, int kamer) {}
	public void buildTrap(int vanVerdieping, int naarVerdieping) {}
}
