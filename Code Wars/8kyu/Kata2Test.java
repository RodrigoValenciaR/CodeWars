package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata2Test {
	 @Test
	    public void basicTests() {
	        assertEquals(-1, Kata2.nthPower(new int[] {1,2}, 2)); 
	        assertEquals(8, Kata2.nthPower(new int[] {3,1,2,2}, 3));
	        assertEquals(4, Kata2.nthPower(new int[] {3,1,2}, 2));
	    }

}
