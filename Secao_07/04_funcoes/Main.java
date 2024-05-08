public class Main {
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int c = 80;

		if (a > b && a > c) {
			System.out.printf("%d e maior", a);
		} else if (b > c) {
			System.out.printf("%d e maior", b);
		} else {
			System.out.printf("%d e maior%n", c);
		}

		int higher = max(a, b, c);
		showResult(higher);
	}

	public static int max(int a, int b, int c) {
		int resultado;
		if (a > b && a > c) {
			resultado = a;
		} else if (b > c) {
			resultado = b;
		} else {
			resultado = c;
		}
		return resultado;
	}

	public static void showResult(int numero) {
		System.out.printf("O numero %d e maior!", numero);
	}
}
