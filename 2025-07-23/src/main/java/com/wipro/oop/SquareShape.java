package com.wipro.oop;

public class SquareShape extends ShapeBase {
    private double sideLength;

    public SquareShape(String fillColor, double sideLength) {
        super(fillColor);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Square [Color=" + getFillColor() + ", Side=" + sideLength + "]";
    }
}
