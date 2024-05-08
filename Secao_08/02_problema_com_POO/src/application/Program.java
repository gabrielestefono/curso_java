package application;

import entities.Triangle;

public class Program {
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

		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Area da triangulo A %.4f%n", areaX);
		System.out.printf("Area da triangulo B %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.printf("A maior area e do triangulo A%n");
		} else {
			System.out.printf("A maior area e do triangulo B%n");
		}
	}
}
