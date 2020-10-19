package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata10Test {

	@Test
	public void test1() {
		assertEquals(true, Kata10.isDivisible(12,4,3));
	}
	@Test
	public void test2() {
		assertEquals(false, Kata10.isDivisible(3,3,4));
	}	

}
