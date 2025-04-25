package org.ezo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void should_test_simple_addition() {
        assertEquals("3", calculator.calculate("1 + 2"));
    }

    @Test
    void should_test_negative() {
        assertEquals("0", calculator.calculate("1 + -1"));
    }

    @Test
    void should_test_Parentheses() {
        assertEquals("21", calculator.calculate("(2 + 5) * 3"));
    }

    @Test
    void should_test_priority_operator() {
        assertEquals("17", calculator.calculate("2 + 2 * 5 + 5"));
    }

    @Test
    void should_test_decimal() {
        assertEquals("7.4", calculator.calculate("2.8*3-1"));
    }

    @Test
    void should_test_exponent() {
        assertEquals("256", calculator.calculate("2^8"));
    }

    @Test
    void should_test_sqrt() {
        assertEquals("2", calculator.calculate("sqrt(4)"));
    }

    @Test
    void should_test_divide_by_zero() {
        assertEquals("Erreur", calculator.calculate("1/0"));
    }
}