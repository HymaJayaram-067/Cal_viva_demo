package com.bhavya.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calc.squareRoot(9), 0.001);
        assertEquals(0.0, calc.squareRoot(0), 0.001);
        assertEquals(-1, calc.squareRoot(-1),0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(0));
        assertEquals(-1, calc.factorial(-1));
    }

    @Test
    public void testPower() {
        assertEquals(1.0, calc.power(0, 0), 0.001);
        assertEquals(1.0, calc.power(1, 39), 0.001);
        assertEquals(1.0, calc.power(2, 0), 0.001);
        assertEquals(-8.0, calc.power(-2, 3), 0.001);
    }

    @Test
    public void testLog() {
        assertEquals(0.0, calc.Log(1), 0.001);
        assertEquals(-1, calc.Log(0),0.001);
        assertEquals(-1, calc.Log(-1),0.001);
    }
}
