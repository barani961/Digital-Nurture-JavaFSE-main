package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddValueTest {

    @Test
    void add() {
        assertEquals(10, AddValue.add(5,5));
    }
}