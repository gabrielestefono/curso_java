import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas horas sao? ");
		int hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom Dia!");

		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa Tarde!");
		} else {
			System.out.println("Boa Noite!");
		}
		sc.close();
	}
}
