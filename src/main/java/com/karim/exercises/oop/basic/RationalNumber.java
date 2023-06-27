package com.karim.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public RationalNumber add(RationalNumber o) {
        int lcm = leastCommonMultiple(denominator, o.getDenominator());
        int num = (lcm / denominator * numerator) + (lcm / o.getDenominator() * o.getNumerator());

        return new RationalNumber(num, lcm);
    }

    public RationalNumber multiply(RationalNumber o) {
        int n = numerator * o.numerator;
        int d = denominator * o.denominator;

        return new RationalNumber(n, d);
    }

    /**
     * Returns the greatest common divisor of two integers
     * -Recursive method
     * @param a
     * @param b
     * @return greatest common divisor between a and b
     */
    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if(rest == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    /**
     * Returns the least common multiple of two integers
     * @param a
     * @param b
     * @return least common multiple
     */
    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }



    /**
     * Con il primo if controlli se sono letteralmente lo stesso oggetto, in quanto controlli se il riferimento è uguale, e se lo è, this e other sono lo stesso oggetto
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }


    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
