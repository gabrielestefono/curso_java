package Secao_04.desafios.desafio_01;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		String product1 = "Computador";
		String product2 = "Mesa de Escritório";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é R$ %.2f%n", product1, price1);
		System.out.printf("%s, cujo preço é R$ %.2f%n", product2, price2);
		System.out.printf("%n");
		System.out.printf("Record: %d anos, código %d e gênero %s%n", age, code, gender);
		System.out.printf("%n");
		System.out.printf("Tamanho com oito numeros decimais: %.8f%n", measure);
		System.out.printf("Arredondado: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Decimal ponto do EUA: %.3f%n", measure);
	}
}