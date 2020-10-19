package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata1Test {
	Kata1 k1= new Kata1();
	@Test
	void test1() {
		assertEquals(1, Kata1.summation(1));
	}
	
	@Test
	void test2() {
		assertEquals(36, Kata1.summation(8));

	}
	

}
