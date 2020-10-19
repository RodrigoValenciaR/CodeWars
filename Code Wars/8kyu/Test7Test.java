package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test7Test {

    @Test public void test4a() {
        assertEquals("aaaa", Test7.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Test7.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Test7.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Test7.repeatStr(0, "kata"));
    }
}
