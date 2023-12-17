package Seminar3.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;

    @BeforeEach
    void setup() {
        main = new Main();
    }

    @Test
    void testEvenOddNumber_EvenTrue() {
        boolean isEven = main.evenOddNumber(2);
        assertTrue(isEven);
    }

    @Test
    void testEvenOddNumber_OddFalse() {
        boolean isEven = main.evenOddNumber(5);
        assertFalse(isEven);
    }

    @Test
    void numberInInterval_From25to100_True() {
        boolean isInInterval = main.numberInInterval(26);
        assertTrue(isInInterval);
    }

    @Test
    void numberInInterval_From25to100_False() {
        boolean isInInterval = main.numberInInterval(24);
        assertFalse(isInInterval);
    }
}