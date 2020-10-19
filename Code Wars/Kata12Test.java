package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata12Test {

    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", Kata12.greet("english"));
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", Kata12.greet("dutch"));
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", Kata12.greet("IP_ADDRESS_INVALID"));
    }
}
