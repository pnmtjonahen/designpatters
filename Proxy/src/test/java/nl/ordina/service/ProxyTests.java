package nl.tjonahen.service;

import nl.tjonahen.proxy.SecureProxy;

import org.junit.Test;


public class ProxyTests {
	@Test
	public void testenSecureProxy() {
		Service s = new SecureProxy(new ServiceImpl());

		s.doeHet();

		SecureProxy.mag = false;

		s.doeHet();
	}

}
