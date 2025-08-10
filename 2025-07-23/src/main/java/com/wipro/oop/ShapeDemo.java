package com.wipro.oop;

public class ShapeDemo {
    public static void main(String[] args) {
        CircleShape circleObj = new CircleShape("Yellow", 6.7);
        RectangleShape rectObj = new RectangleShape("Orange", 5.2, 7.8);
        SquareShape squareObj = new SquareShape("Purple", 4.9);

        System.out.println(circleObj);
        System.out.println(rectObj);
        System.out.println(squareObj);
    }
}
