package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata5Test {
    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", Kata5.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", Kata5.weatherInfo(23));
    }

}
