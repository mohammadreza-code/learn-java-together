package com.github.javabaz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator13Test {
    private Calculator13 calculator13;

    @BeforeEach
    void setUp() { calculator13 =new Calculator13();
    }

    @Test
    void add() {
        assertEquals(8, calculator13.add(5, 3), "5 + 3 should be 8");
        assertEquals(-2, calculator13.add(-5, 3), "-5 + 3 should be -2");
        assertEquals(0, calculator13.add(0, 0), "0 + 0 should be 0");
    }

    @Test
    void subtract() {
        assertEquals(2, calculator13.subtract(5, 3), "5 - 3 should be 2");
        assertEquals(-8, calculator13.subtract(-5, 3), "-5 - 3 should be -8");
        assertEquals(0, calculator13.subtract(3, 3), "3 - 3 should be 0");
    }

    @Test
    void multiply() {
        assertEquals(15, calculator13.multiply(5, 3), "5 * 3 should be 15");
        assertEquals(-15, calculator13.multiply(-5, 3), "-5 * 3 should be -15");
        assertEquals(0, calculator13.multiply(0, 3), "0 * 3 should be 0");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator13.divide(6, 3), "6 / 3 should be 2");
        assertEquals(-2, calculator13.divide(-6, 3), "-6 / 3 should be -2");
        assertEquals(0, calculator13.divide(0, 5), "0 / 5 should be 0");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator13.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}