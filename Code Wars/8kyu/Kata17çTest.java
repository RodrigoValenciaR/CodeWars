package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata17ÁTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", Kata17Á.abbrevName("sam harris"));
        assertEquals("P.F", Kata17Á.abbrevName("Patrick Feenan"));
        assertEquals("E.C", Kata17Á.abbrevName("Evan Cole"));
        assertEquals("P.F", Kata17Á.abbrevName("P Favuzzi"));
        assertEquals("D.M", Kata17Á.abbrevName("David Mendieta"));
    }

}
