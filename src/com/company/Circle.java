package com.company;

public class Circle<T extends Number> implements Figures<Double> {

    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * radius.intValue() * radius.intValue();
    }
}
