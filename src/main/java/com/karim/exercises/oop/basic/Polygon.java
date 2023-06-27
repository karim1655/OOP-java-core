package com.karim.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     * int next = (i + 1) % vertices.length; --> è per chiudere il poligono, quando arrivo alla fine devo congiungere l'ultimo vertice, ovvero i = vertices.lengh - 1
     * con il primo, ovvero lo zeresimo, ovvero next = (i + 1) % vertices.lengh = vertices.lengh % vertices.lengh = 0
     * @return
     */
    public double getPerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;

            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }
        return perimeter;
    }

    /**
     * Per la roba di next guarda il commento di getPerimeter
     * Per il metodo del calcolo dell'area di un poligono non regolare: https://arachnoid.com/area_irregular_polygon/index.html
     * @return area of an irregular polygon
     */
    public double getArea() {
        double area = 0.0;
        for(int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;

            area += vertices[i].x * vertices[next].y - vertices[i].y * vertices[next].x;
        }
        return Math.abs(area / 2);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
