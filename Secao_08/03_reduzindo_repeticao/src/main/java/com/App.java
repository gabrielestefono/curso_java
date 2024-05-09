package com;

import entities.Triangle;

public class App {
    public static void main(String[] args) {
        Triangle x;
        Triangle y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo X: ");

        x.a = 3.0;
        x.b = 4.0;
        x.c = 5.0;

        System.out.println("Entre com as medidas do triangulo Y: ");
        y.a = 2.0;
        y.b = 4.0;
        y.c = 6.0;

        System.out.printf("Area da triangulo A %.4f%n", x.area());
        System.out.printf("Area da triangulo B %.4f%n", y.area());

        if (y.area() > x.area()) {
            System.out.printf("A maior area e do triangulo X%n");
        } else {
            System.out.printf("A maior area e do triangulo Y%n");
        }
    }
}
