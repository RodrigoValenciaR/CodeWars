package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata11Test {

    @Test
    public void fixedTests() {
         assertEquals(166, Kata11.dutyFree(12,50,1000));
         assertEquals(294, Kata11.dutyFree(17,10,500));
         assertEquals(357, Kata11.dutyFree(24,35,3000));
         assertEquals(20, Kata11.dutyFree(1400,35,10000));
         assertEquals(38, Kata11.dutyFree(700,26,7000));
    }

}
