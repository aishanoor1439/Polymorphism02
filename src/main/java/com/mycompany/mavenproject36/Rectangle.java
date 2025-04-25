
package com.mycompany.mavenproject36;

public class Rectangle extends Square{
    protected double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
