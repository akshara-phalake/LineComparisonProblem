package com.example.linecomparison;

public class LineLength {
    Point p1;
    Point p2;
    Double length;

    Double getLength() {
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }
}
