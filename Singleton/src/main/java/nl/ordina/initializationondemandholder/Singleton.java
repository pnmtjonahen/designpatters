package nl.tjonahen.initializationondemandholder;

public class Singleton {
	private Singleton() {
	}

	private static class SingletonHolder {
		static final Singleton _instance = new Singleton();
	}

	public static Singleton instance() {
		return SingletonHolder._instance;
	}
}


