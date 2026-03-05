package org.example;

public class Wall {
    // 2 instance variable
    private double width;
    private double height;

    // Constructor (2 parametreyi set etmeli)
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // İstenen 5 method
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}
