package com.karim.exercises.oop.basic;

import java.awt.*;

public class Circle {
    Point center;
    int radius;

    /**
     * Constructor
     * @param center
     * @param radius
     */
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Getters
     */
    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    /**
     * Setters
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * sqrt((x-x0)^2 + (y-y0)^2) < radius
     * @param point
     * @return
     */
    public boolean contains(Point point) {
        return Math.hypot(point.x - center.x, point.y - center.y) < radius;
    }

    public void translate(int dx, int dy) {
        //center.translate(dx, dy); //la funzione che lo fa direttamente
        center.x += dx;
        center.y += dy;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
