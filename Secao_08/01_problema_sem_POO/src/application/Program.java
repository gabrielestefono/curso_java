package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Entre com as medidas do triangulo A: ");
		xA = sc.nextInt();
		xB = sc.nextInt();
		xC = sc.nextInt();

		System.out.println("Entre com as medidas do triangulo A: ");
		yA = sc.nextInt();
		yB = sc.nextInt();
		yC = sc.nextInt();

		double p = (xA + xB + xC) / 2.0;
		double areaA = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaB = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

		System.out.printf("Area da triangulo A %.4f%n", areaA);
		System.out.printf("Area da triangulo B %.4f%n", areaB);

		if (areaA > areaB) {
			System.out.printf("A maior area e do triangulo A%n");
		} else {
			System.out.printf("A maior area e do triangulo B%n");
		}

		sc.close();
	}
}
