package nl.tjonahen;

import nl.tjonahen.builders.BungalowBuilder;
import nl.tjonahen.builders.BunkerBuilder;
import nl.tjonahen.builders.FlatBuilder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Client deel van het builder pattern.
 * 
 *
 */
public class GebouwenBuilderTest {

		@Test
		public void testFlatGebouw() {
	/*
	 * Client creeert een Aannemer (director) en configureert het met een builder (concrete builder)
	 */ 
			GebouwenBuilder concreteBuilder = new FlatBuilder();

			Aannemer kees = new Aannemer(concreteBuilder);
			kees.construct();
			
			Assert.assertNotNull(concreteBuilder.getGebouw());
			
		}

		@Test
		public void testBugalow() {
			GebouwenBuilder concreteBuilder = new BungalowBuilder();
			
			Aannemer kees = new Aannemer(concreteBuilder);
			kees.construct();
			
			Assert.assertNotNull(concreteBuilder.getGebouw());
		}

		@Test
		public void testBunker() {
			GebouwenBuilder concreteBuilder = new BunkerBuilder();
			
			Aannemer kees = new Aannemer(concreteBuilder);
			kees.construct();

			Assert.assertNotNull(concreteBuilder.getGebouw());
		}
}
