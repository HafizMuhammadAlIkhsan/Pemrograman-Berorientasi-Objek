package com;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString() + "of radius " + radius + " and height " + height;
    }  
}
