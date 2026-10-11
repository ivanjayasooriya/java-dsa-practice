package design_patterns.structural.decorator;

import design_patterns.creational.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
