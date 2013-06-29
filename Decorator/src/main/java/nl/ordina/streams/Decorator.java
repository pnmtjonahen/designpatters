package nl.tjonahen.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decorator {

	public void kennyFilteredInput() throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(new SouthparkFilter(System.in)));
		String line = in.readLine();
		while (!"".equals(line)) {
			System.out.println(line);
			line = in.readLine();
		}

	}


}
