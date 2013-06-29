package nl.tjonahen.proxy;

import nl.tjonahen.service.Service;

/**
 * Proxy pattern.
 *
 * Zie ook commentaar op blz 217.
 *
 * Er zijn dus meerdere soorten proxy implementaties
 */
public class SecureProxy implements Service {
	public static boolean mag = true;
	private Service next;
	public SecureProxy(Service service) {
		next = service;
	}
	public void doeHet() {
		if (mag)
			next.doeHet();
		else
			System.out.println("magniet Doe het..");
	}

}
