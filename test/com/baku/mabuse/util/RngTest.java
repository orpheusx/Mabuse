package com.baku.mabuse.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RngTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRoll1() {
		Rng rng = new Rng(42L);
		for (int i = 0; i < 100; i++) {
			System.out.print(rng.roll(3, 0));
			System.out.print(" ");
			if(i%10==0)
				System.out.println();
		}
	}

	@Test
	public void testRoll2() {
		Rng rng = new Rng();
		int roll = rng.roll(1, 0);
		System.out.println(roll);
	}

}
