package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAddition() {
        int a = 2;
        int b = 3;
        assertEquals(5, a + b, "2 + 3 phải bằng 5");
    }
}
