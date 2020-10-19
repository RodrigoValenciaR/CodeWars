package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata19Test {

    @Test
    public void testSomething() {
        assertEquals(Kata19.check(new Object[] {66, 101}, 66), true);
        assertEquals(Kata19.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(Kata19.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(Kata19.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }

}
