package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata13Test {
	  @Test
	  public void PeopleThatPlayBanjo() {
	    assertEquals( "Nope!", "Martin does not play banjo", Kata13.areYouPlayingBanjo("Martin"));
	    assertEquals( "Nope!", "Rikke plays banjo", Kata13.areYouPlayingBanjo("Rikke"));
	  }
}
