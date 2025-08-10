package com.wipro.oop;

public class CircleShape extends ShapeBase {
    private double radiusLength;

    public CircleShape(String fillColor, double radiusLength) {
        super(fillColor);
        this.radiusLength = radiusLength;
    }

    public double getRadiusLength() {
        return radiusLength;
    }

    public void setRadiusLength(double radiusLength) {
        this.radiusLength = radiusLength;
    }

    @Override
    public String toString() {
        return "Circle [Color=" + getFillColor() + ", Radius=" + radiusLength + "]";
    }
}
