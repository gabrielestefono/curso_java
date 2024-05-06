public class Main {
	public static void main(String[] args){
		// Soma de Inteiros
		int x, y;

		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);

		// Soma de double + Inteiros
		int z;
		double k;

		z = 5;
		k = 2 * z;

		System.out.println(z);
		System.out.println(k);

		// Area do trapézio

		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.println(area);

		// Divisao

		int a, d;
		double resultado;

		a = 5;
		d = 2;

		resultado = a / d;

		System.out.println(resultado);

		// Double para int

		double na;
		int nb;

		na = 5.0;
		nb = (int) na;

		System.out.println(nb);
	}
}
