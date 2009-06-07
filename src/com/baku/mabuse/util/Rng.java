/**
 * 
 */
package com.baku.mabuse.util;

import java.util.Random;


/**
 * @author mark
 * 
 */
public class Rng {

	public static final int SIX_SIDED = 6;

	private Random r;
	private int sides = SIX_SIDED;

	/**
	 * Creates a random number generator with the default settings.
	 */
	public Rng() {
		r = new Random();
	}

	/**
	 * Creates a random number generator that returns integers ranging from 1 to the provided value
	 * 
	 * @param sides specifies the high end of the number range
	 */
	public Rng(int sides) {
		this();
		this.sides = sides;
	}

	/**
	 * Creates a random number generator that returns integers ranging from 1 to the provided value. The generator is seeded with the provided value allowing replayability.
	 * @param sides
	 * @param seed
	 */
	public Rng(int sides, long seed) {
		this.sides = sides;
		r = new Random(seed);
	}

	/**
	 * For debugging/QA purposes allow the seed to be set. This guarantees the same stream of
	 * numbers will be produced allowing us to 'replay' sequences.
	 * 
	 * @param seed
	 */
	public Rng(long seed) {
		r = new Random(seed);
	}

	public int roll(int num, int delta) {
		int roll = 0;
		for (int i = 0; i < num; i++) {
			roll += 1 + r.nextInt(sides);
		}
		return roll;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rng rng = new Rng();
		for (int i = 0; i < 100; i++) {
			System.out.print(rng.roll(1, 0));
			System.out.print(" ");
			if (i > 0 && i % 20 == 0)
				System.out.println();
		}
	}

}
