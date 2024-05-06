public class Main {
	public static void main(String[] args) {

		// Condição Lógica E (&&)
		int x = 5;
		boolean valor1 = x <= 20 && x == 10; // falsa
		boolean valor2 = x > 0 && x != 3; // Verdadeira
		boolean valor3 = x <= 20 && x == 10 && x != 3; // falsa
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);

		// Condição Lógica OU (||)
		boolean valor4 = x == 10 || x <= 20; // Verdadeiro
		boolean valor5 = x > 0 || x != 3; // Verdadeira
		boolean valor6 = x <= 0 || x != 3 || x != 5; // verdadeiro
		System.out.println(valor4);
		System.out.println(valor5);
		System.out.println(valor6);

		// Operador NÃO (!)
		boolean valor7 = !(x == 10); // Verdadeiro
		boolean valor8 = !(x >= 2); // Falso
		boolean valor9 = !(x <= 20 && x == 10); // verdadeiro
		System.out.println(valor7);
		System.out.println(valor8);
		System.out.println(valor9);
	}
}
