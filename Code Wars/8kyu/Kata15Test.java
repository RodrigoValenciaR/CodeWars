package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata15Test {


   @Test
    public void checkSmallValues() {
        assertEquals(6, Kata15.expressionsMatter(2, 1, 2));
        assertEquals(3, Kata15.expressionsMatter(1, 1, 1));
        assertEquals(4, Kata15.expressionsMatter(2, 1, 1));
        assertEquals(9, Kata15.expressionsMatter(1, 2, 3));
        assertEquals(6, Kata15.expressionsMatter(1, 3, 1));
        assertEquals(8, Kata15.expressionsMatter(2, 2, 2));
    }
  
    @Test
    public void checkIntermediateValues() {
        assertEquals( 20, Kata15.expressionsMatter(5, 1, 3));
        assertEquals(105, Kata15.expressionsMatter(3, 5, 7));
        assertEquals( 35, Kata15.expressionsMatter(5, 6, 1));
        assertEquals(  8, Kata15.expressionsMatter(1, 6, 1));
        assertEquals( 14, Kata15.expressionsMatter(2, 6, 1));
        assertEquals( 48, Kata15.expressionsMatter(6, 7, 1));
    }

    @Test
    public void checkMixedValues() {
        assertEquals( 60, Kata15.expressionsMatter( 2, 10,  3));
        assertEquals( 32, Kata15.expressionsMatter( 1,  8,  3));
        assertEquals(126, Kata15.expressionsMatter( 9,  7,  2));
        assertEquals( 20, Kata15.expressionsMatter( 1,  1, 10));
        assertEquals( 18, Kata15.expressionsMatter( 9,  1,  1));
        assertEquals(300, Kata15.expressionsMatter(10,  5,  6));
        assertEquals( 12, Kata15.expressionsMatter( 1, 10,  1));
    }	void test() {
		fail("Not yet implemented");
	}

}
