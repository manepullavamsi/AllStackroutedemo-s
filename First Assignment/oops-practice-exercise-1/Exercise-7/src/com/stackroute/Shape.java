package com.stackroute;

//Shape is an parent class it is going to be extended by all other classes and method overriding takes place
public class Shape {
    public static void draw()           //This method is going to override with this we are able achvide polymorphism
    {
        System.out.println("This is a Genral Draw Method");
    }

    public static void erase() {
        System.out.println("This is a Genral erase method");
    }

    public static void main(String[] args) {
        draw();
        erase();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.draw();
        circle.erase();
        square.draw();
        square.erase();
        triangle.draw();
        triangle.erase();

    }
}
