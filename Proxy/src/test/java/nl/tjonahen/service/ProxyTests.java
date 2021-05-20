/*
 * Copyright (C) 2013 Philippe Tjon-A-Hen philippe@tjonahen.nl
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package nl.tjonahen.service;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import nl.tjonahen.proxy.SecureProxy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProxyTests {

  private PrintStream originalSystemOut;
  private ByteArrayOutputStream systemOutContent;

  @BeforeEach
  void redirectSystemOutStream() {
    originalSystemOut = System.out;
    systemOutContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(systemOutContent));
  }

  @AfterEach
  void restoreSystemOutStream() {
    System.setOut(originalSystemOut);
    System.out.println(systemOutContent.toString());
  }

  @Test
  public void testenSecureProxy() {
    Service s = new SecureProxy(new ServiceImpl());

    SecureProxy.mag = true;
    s.doeHet();
    Assertions.assertTrue(systemOutContent.toString().contains("Doe het.."));
  }

  @Test
  public void testenSecureProxyNotAllowed() {
    Service s = new SecureProxy(new ServiceImpl());

    SecureProxy.mag = false;
    s.doeHet();
    Assertions.assertTrue(systemOutContent.toString().contains("magniet"));
  }
}
