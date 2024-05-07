import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Digite a temperatura em celcius: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("O equivalente em Fahrenheit e %.1f%n", f);
			System.out.println("Deseja Repetir? S / N");
			resp = sc.next().charAt(0);
		} while (resp != 'N');
		sc.close();
	}
}
