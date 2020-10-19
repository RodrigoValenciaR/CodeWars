package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata14Test {

    @Test 
    public void basicTests() {
        assertEquals(Integer.valueOf(6), Kata14.find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        assertEquals(null, Kata14.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(Integer.valueOf(6), Kata14.find(new int[]{4, 6, 7, 8, 9, 11}));
        assertEquals(Integer.valueOf(11), Kata14.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        assertEquals(null, Kata14.find(new int[]{31, 32}));
        assertEquals(Integer.valueOf(0), Kata14.find(new int[]{-3, -2, 0, 1}));
        assertEquals(Integer.valueOf(-1), Kata14.find(new int[]{-5, -4, -3, -1}));
    }

}
