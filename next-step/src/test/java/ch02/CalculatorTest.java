package ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator cal = new Calculator();
        assertEquals(9, cal.add(6, 3));
    }

    @Test
    void subtract() {
        Calculator cal = new Calculator();
        assertEquals(3, cal.subtract(6, 3));
    }

}
