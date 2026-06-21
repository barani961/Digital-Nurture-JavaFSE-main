package org.example;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MobileTest {

    static Mobile mobile;

    @BeforeAll
    static void setUp() {
        mobile = new Mobile("Samsung");
    }

    @Test
    void testBrand() {

        //Arrange
        String expected = "Samsung";

        //Act
        String actual = mobile.getBrand();

        //Assert
        assertEquals(expected, actual);
    }

    @AfterAll
    static void tearDown() {
        mobile = null;
    }
}