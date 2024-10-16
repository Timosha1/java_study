package org.example.hw_point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(0, 0);
        point.currentCoordinates();
        point.moveUp();
        point.moveRight();
        point.moveUp();
        point.moveLeft();
        point.currentCoordinates();
    }
}


