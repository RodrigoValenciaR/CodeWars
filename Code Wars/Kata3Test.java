package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata3Test {
 	@Test
	public void simpleTest() {
		assertEquals(2,Kata3.getAverage(new int[] {2,2,2,2}));
		assertEquals(3,Kata3.getAverage(new int[] {1,2,3,4,5}));
		assertEquals(1,Kata3.getAverage(new int[] {1,1,1,1,1,1,1,2}));
	}

}
