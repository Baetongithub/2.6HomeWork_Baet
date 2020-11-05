package com.company;

public class Rectangle<T extends Number> implements Figures<Double> {

    private T sideA, sideB;

    public Rectangle(T sideA, T sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public Double getArea() {
        return sideA.doubleValue() * sideB.doubleValue();
    }
}