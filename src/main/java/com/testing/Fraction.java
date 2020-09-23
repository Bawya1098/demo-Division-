package com.testing;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction invert() {
        if (numerator == 0) {
            throw new ArithmeticException("Exception");
        }
        if (numerator == Integer.MIN_VALUE) {
            throw new ArithmeticException("Exception");
        }
        if (numerator < 0) {
            return new Fraction(-denominator, -numerator);
        }

        return new Fraction(denominator, numerator);
    }

    public float getFloat() {
        Fraction invert = invert();
        return ((float) (invert.denominator / invert.numerator));
    }
}
