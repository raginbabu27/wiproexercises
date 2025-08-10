package com.wipro.oop;

public class RectangleShape extends ShapeBase {
    private double rectLength;
    private double rectWidth;

    public RectangleShape(String fillColor, double rectLength, double rectWidth) {
        super(fillColor);
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    public double getRectLength() {
        return rectLength;
    }

    public void setRectLength(double rectLength) {
        this.rectLength = rectLength;
    }

    public double getRectWidth() {
        return rectWidth;
    }

    public void setRectWidth(double rectWidth) {
        this.rectWidth = rectWidth;
    }

    @Override
    public String toString() {
        return "Rectangle [Color=" + getFillColor() + ", Length=" + rectLength + ", Width=" + rectWidth + "]";
    }
}
