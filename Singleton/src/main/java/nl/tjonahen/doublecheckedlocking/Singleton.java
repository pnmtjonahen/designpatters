package nl.tjonahen.doublecheckedlocking;

public class Singleton {
	private Singleton() {
	}

	private static Singleton _instance = null;

	public static synchronized Singleton instance() {
		if (_instance == null) {
			_instance = new Singleton();
		}
		return _instance;
	}
}
