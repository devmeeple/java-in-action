package ch02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator cal;

    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @Test
    void add() {
        assertEquals(9, cal.add(6, 3));
    }

    @Test
    void subtract() {
        assertEquals(3, cal.subtract(6, 3));
    }

}
