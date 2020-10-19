package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata4Test {

	  @Test
	  public void basicTests() throws Exception{
	    Kata4 cockroach = new Kata4();
	    assertEquals(30, cockroach.cockroachSpeed(1.08));
	    assertEquals(30, cockroach.cockroachSpeed(1.09));
	    assertEquals(0, cockroach.cockroachSpeed(0));
	  }

}
