package geek;

public class Programa04 {
	public static void main(String[] args) {
		// Declarando e inicializando a variável
		int numero = 9;

		int verificador = 9;

		if (numero > verificador) {
			System.out.println("Sim, o numero " + numero + " é maior que " + verificador + "!");
		}else if(numero == verificador){
			System.out.println("O numero " + numero + " é igual à " + verificador + "!");
		}
		else{
			System.out.println("Não, o numero " + numero + " não é maior que " + verificador + "!");
		}
	}
}
