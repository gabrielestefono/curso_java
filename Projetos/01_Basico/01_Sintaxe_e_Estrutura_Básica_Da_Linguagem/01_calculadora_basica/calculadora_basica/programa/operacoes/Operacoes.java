package programa.operacoes;

public class Operacoes {
    public static void imprimir(String resultado){
        System.out.println(resultado);
    }

    private Operacoes(){}

    public static void somar(Double numero1, Double numero2){
        String resultado = numero1 + " + " + numero2 + " = " + (numero1 + numero2);
        Operacoes.imprimir(resultado);
    }

    public static void subtrair(Double numero1, Double numero2){
        String resultado = numero1 + " - " + numero2 + " = " + (numero1 - numero2);
        Operacoes.imprimir(resultado);
    }

    public static void multiplicar(Double numero1, Double numero2){
        String resultado = numero1 + " * " + numero2 + " = " + (numero1 * numero2);
        Operacoes.imprimir(resultado);
    }

    public static void dividir(Double numero1, Double numero2){
        String resultado = numero1 + " / " + numero2 + " = " + (numero1 / numero2);
        Operacoes.imprimir(resultado);
    }
}