package com.karim.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    /**
     * Definisco l'errore entro cui voglio calcolare le cose
     * 1e-06 = 1*10^(-6)
     */
    public static final double DELTA = 1e-06;
    Circle circle = new Circle(new Point(0, 0), 10);

    @Test
    void getPerimeter() {
        assertEquals(62.8318530, circle.getPerimeter(), DELTA);
    }

    @Test
    void getArea() {
        assertEquals(314.1592653, circle.getArea(), DELTA);
    }

    @Test
    void contains() {
        assertTrue(circle.contains(new Point(0, 0)));
        assertFalse(circle.contains(new Point(11, 11)));
    }

    @Test
    void translate() {
        circle.translate(10, 5);
        assertEquals(10, circle.getCenter().getX());
        assertEquals(5, circle.getCenter().getY());
    }
}