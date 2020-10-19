package codeWars1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Kata16Test {

    @Test
    public void basicTests() {
        assertEquals(30, Kata16.points(new String[]
                         {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
                     
        assertEquals(10, Kata16.points(new String[]
                         {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
                     
        assertEquals(0, Kata16.points(new String[]
                         {"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));
        
        assertEquals(15, Kata16.points(new String[]
                         {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"}));
                     
        assertEquals(12, Kata16.points(new String[]
                         {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }

}
