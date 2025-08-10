package com.wipro.oop;

public class ShapeBase {
    private String fillColor;

    public ShapeBase(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "Shape Color: " + fillColor;
    }
}
