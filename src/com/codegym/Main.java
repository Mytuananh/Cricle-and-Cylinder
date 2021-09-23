package com.codegym;

public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle("green",3.5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        Circle cy = new Cylinder(2.5);
        System.out.println(cy);
    }
}
