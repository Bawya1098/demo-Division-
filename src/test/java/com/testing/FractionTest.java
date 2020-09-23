package com.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test
    public void testInvert() {
        Fraction fraction = new Fraction(1, 2);
        Fraction result = fraction.invert();

        assertEquals(2, result.getFloat(), 0.00001);
    }

    @Test
    public void testInvertInNegative() {
        Fraction fraction = new Fraction(-1, 2);
        Fraction result = fraction.invert();

        assertEquals(-2, result.getFloat(), 0.00001);
    }
    @Test
    public void testInvertInNegativeLessThanZero() {
        Fraction fraction = new Fraction(-1, -2);
        Fraction result = fraction.invert();

        assertEquals(2, result.getFloat(), 0.00001);
    }

    @Test(expected = ArithmeticException.class)
    public void testInvertZero() {
        Fraction fraction = new Fraction(0, 2);

        fraction.invert();
    }

    @Test(expected = ArithmeticException.class)
    public void testInvertMinValue() {
        int minValue = Integer.MIN_VALUE;
        Fraction fraction = new Fraction(minValue, 2);

        fraction.invert();
    }
}