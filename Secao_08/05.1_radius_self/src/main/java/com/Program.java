package com;

/**
 * Hello world!
 *
 */
public class Program {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        double circunference = circunference(3.0);
        double volume = circunference(3.0);
        System.out.println(circunference);
        System.out.println(volume);
    }

    public static double circunference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
