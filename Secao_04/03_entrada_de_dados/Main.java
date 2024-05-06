import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.print("Qual o seu nome? ");
		x = sc.next();
		int y;
		System.out.print("Qual a sua idade? ");
		y = sc.nextInt();
		double z;
		System.out.print("Qual a sua altura? ");
		z = sc.nextDouble();
		System.out.printf("Ola, %s, parabens pelos seus %d anos de vida! Sei que voce tem %.2f de altura%n", x, y, z);
		char k;
		System.out.print("Qual seu sexo? M ou F ");
		k = sc.next().charAt(0);
		if (k == 'F') {
			System.out.print("Legal, entao voce e Mulher!");
		} else if (k == 'M') {
			System.out.print("Legal, entao voce e homem!");
		} else {
			System.out.print("Não sei o que isso significa");
		}
		sc.close();
	}
}