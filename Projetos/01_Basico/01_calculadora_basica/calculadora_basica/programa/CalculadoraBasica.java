package programa;

import java.util.Scanner;
import programa.operacoes.Operacoes;

public class CalculadoraBasica {
    public static final String PRIMEIRO_CONSOLE = "Digite o primeiro numero: ";

    public static final String SEGUNDO_CONSOLE = "Digite o primeiro numero: ";

    private int operacao = 0;

    public void mostrarPrimeiraPergunta(CalculadoraBasica calculadoraBasica, Scanner sc){
        Operacoes.imprimir("Qual operação deseja realizar?");
        Operacoes.imprimir("1 = Soma");
        Operacoes.imprimir("2 = Subtração");
        Operacoes.imprimir("3 = Divisão");
        Operacoes.imprimir("4 = Multiplicação");
        calculadoraBasica.operacao = sc.nextInt();
    }

    public void mostrarSegundaPergunta(CalculadoraBasica calculadoraBasica, Scanner sc){
        Operacoes.imprimir(PRIMEIRO_CONSOLE);
        double numero1 = sc.nextDouble();
        Operacoes.imprimir(SEGUNDO_CONSOLE);
        double numero2 = sc.nextDouble();
        switch (calculadoraBasica.operacao) {
            case 1 -> Operacoes.somar(numero1, numero2);
            case 2 -> Operacoes.subtrair(numero1, numero2);
            case 3 -> Operacoes.dividir(numero1, numero2);
            case 4 -> Operacoes.multiplicar(numero1, numero2);
            default -> Operacoes.somar(numero1, numero2);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            CalculadoraBasica calculadoraBasica = new CalculadoraBasica();
            calculadoraBasica.mostrarPrimeiraPergunta(calculadoraBasica, sc);
            boolean valorValido = true;
            while (valorValido) {
                switch(calculadoraBasica.operacao) {
                    case 1 -> {
                        calculadoraBasica.mostrarSegundaPergunta(calculadoraBasica, sc);
                        valorValido = false;
                    }
                    case 2 -> {
                        calculadoraBasica.mostrarSegundaPergunta(calculadoraBasica, sc);
                        valorValido = false;
                    }
                    case 3 -> {
                        calculadoraBasica.mostrarSegundaPergunta(calculadoraBasica, sc);
                        valorValido = false;
                    }
                    case 4 -> {
                        calculadoraBasica.mostrarSegundaPergunta(calculadoraBasica, sc);
                        valorValido = false;
                    }
                    default -> {
                        Operacoes.imprimir("Valor inválido, por favor, tente novamente!");
                        Operacoes.imprimir("");
                        calculadoraBasica.mostrarPrimeiraPergunta(calculadoraBasica, sc);
                    }
                }
            }
        }
    }
}