package org.example.poklee;

import org.junit.Test;

import junit.framework.TestCase;


public class PokLibTest extends TestCase {

	@Test
	public void test() {
		System.out.println("Running " + this.getClass().getName() + ".test()");
		
		assertNotNull(PokLib.greet("Pok"));
	}
}
