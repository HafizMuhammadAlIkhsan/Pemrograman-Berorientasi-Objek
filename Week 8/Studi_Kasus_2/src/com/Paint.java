package com;

public class Paint {
    private double coverage;

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amoung for " + s);
        return s.area() / coverage;
    }
}