
package com.mycompany.mavenproject36;

public class Square extends Shape{
    protected double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
