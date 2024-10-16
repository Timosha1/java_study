package org.example.hw_point;

public class Point implements Movable {
    private int X;
    private int Y;

    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void currentCoordinates() {
        System.out.println("Coordinates is (" + X + ", " + Y + ")");
    }

    @Override
    public void moveUp() {
        Y++;
    }

    @Override
    public void moveDown() {
        Y--;
    }

    @Override
    public void moveLeft() {
        X--;
    }

    @Override
    public void moveRight() {
        X++;
    }

}

