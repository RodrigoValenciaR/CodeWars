package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata17�Test {

    @Test
    public void testFixed() {
        assertEquals("S.H", Kata17�.abbrevName("sam harris"));
        assertEquals("P.F", Kata17�.abbrevName("Patrick Feenan"));
        assertEquals("E.C", Kata17�.abbrevName("Evan Cole"));
        assertEquals("P.F", Kata17�.abbrevName("P Favuzzi"));
        assertEquals("D.M", Kata17�.abbrevName("David Mendieta"));
    }

}
