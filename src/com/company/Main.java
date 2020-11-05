package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle<?> rectangle = new Rectangle<>(5, 2.3);
        Circle<Integer> circle = new Circle<>(3);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " + circle.getArea());

    }
}
