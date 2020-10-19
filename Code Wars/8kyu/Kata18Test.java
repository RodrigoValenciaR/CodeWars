package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata18Test {

    @Test
    public void sampleTests() {
        assertEquals(21, Kata18.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
        assertEquals(-21, Kata18.arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
        assertEquals(15, Kata18.arrayPlusArray(new int[]{0,0,0}, new int[]{4,5,6}));
        assertEquals(2100, Kata18.arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}
