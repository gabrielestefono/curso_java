package programa.conversor;

import java.util.Scanner;

public class Conversor {
  private static final String FAHRENHEIT = "Fahrenheit";
  private static final String KELVIN = "Kelvin";
  private static final String CELCIUS = "Celcius";

  public Conversor(){
    // Empty Constructor
  }

  public void mostrarMensagem(String mensagem){
    System.out.println(mensagem);
  }

  public void mostrarSaida(
    double valorEntrada,String unidadeMedidaEntrada, String unidadeMedidaSaida, String resultado
    ){
    this.mostrarMensagem(
      "O resultado é de "
        + valorEntrada
        + " graus em "
        + unidadeMedidaEntrada
        + " é: "
        + resultado
        + " "
        + unidadeMedidaSaida
    );
  }

  public void mostrarPrimeiroConsole(Scanner sc){
    this.mostrarMensagem("Escolha qual a unidade de medida de entrada:");
    this.mostrarMensagem("1 - " + FAHRENHEIT);
    this.mostrarMensagem("2 - " + KELVIN);
    this.mostrarMensagem("3 - " + CELCIUS);
    int entrada = sc.nextInt();
    this.mostrarMensagem("Escolha qual a unidade de medida da saída:");
    this.mostrarMensagem("1 - " + FAHRENHEIT);
    this.mostrarMensagem("2 - " + KELVIN);
    this.mostrarMensagem("3 - " + CELCIUS);
    int saida = sc.nextInt();
    String operacao = String.valueOf("" + entrada + "" + saida);
    Double temperatura;
    switch(operacao) {
      case "11" -> {
        temperatura = this.mostrarSegundoConsole(sc, FAHRENHEIT);
        this.mostrarSaida(temperatura, FAHRENHEIT, FAHRENHEIT, String.valueOf(temperatura));
      }
      case "12" -> {
        temperatura = this.mostrarSegundoConsole(sc, FAHRENHEIT);
        String resultado = this.fahrenheitToKelvin(temperatura);
        this.mostrarSaida(temperatura, FAHRENHEIT, KELVIN, resultado);
      }
      case "13" -> {
        temperatura = this.mostrarSegundoConsole(sc, FAHRENHEIT);
        String resultado = this.fahrenheitToCelcius(temperatura);
        this.mostrarSaida(temperatura, FAHRENHEIT, CELCIUS, resultado);
      }
      case "21" -> {
        temperatura = this.mostrarSegundoConsole(sc, KELVIN);
        String resultado = this.kelvinToFahrenheit(temperatura);
        this.mostrarSaida(temperatura, KELVIN, FAHRENHEIT, resultado);
      }
      case "22" -> {
        temperatura = this.mostrarSegundoConsole(sc, KELVIN);
        this.mostrarSaida(temperatura, KELVIN, KELVIN, String.valueOf(temperatura));
      }
      case "23" -> {
        temperatura = this.mostrarSegundoConsole(sc, KELVIN);
        String resultado = this.kelvinToCelcius(temperatura);
        this.mostrarSaida(temperatura, KELVIN, CELCIUS, resultado);
      }
      case "31" -> {
        temperatura = this.mostrarSegundoConsole(sc, CELCIUS);
        String resultado = this.celciusToFahrenheit(temperatura);
        this.mostrarSaida(temperatura, CELCIUS, FAHRENHEIT, resultado);
      }
      case "32" -> {
        temperatura = this.mostrarSegundoConsole(sc, CELCIUS);
        String resultado = this.celciusToKelvin(temperatura);
        this.mostrarSaida(temperatura, CELCIUS, KELVIN, resultado);
      }
      case "33" -> {
        temperatura = this.mostrarSegundoConsole(sc, CELCIUS);
        this.mostrarSaida(temperatura, CELCIUS, CELCIUS, String.valueOf(temperatura));
      }
      default -> {
        this.mostrarMensagem("Valores errados, por favor, tente novamente!");
        this.mostrarPrimeiroConsole(sc);
      }
    }
  }

  public Double mostrarSegundoConsole(Scanner sc, String entrada){
    this.mostrarMensagem("Por favor, digite a temperatura em " + entrada + ": ");
    return sc.nextDouble();
  }

  public String celciusToFahrenheit(double temperatura){
    return String.valueOf(((temperatura * 9)/5) + 32);
  }

  public String celciusToKelvin(double temperatura){
    return String.valueOf(temperatura + 273.15);
  }

  public String fahrenheitToCelcius(double temperatura){
    return String.valueOf(((temperatura - 32)*5)/9);
  }

  public String fahrenheitToKelvin(double temperatura){
    return String.valueOf((((temperatura - 32)*5)/9) + 273.15);
  }

  public String kelvinToCelcius(double temperatura){
    return String.valueOf(temperatura - 273.15);
  }

  public String kelvinToFahrenheit(double temperatura){
    return String.valueOf((((temperatura - 273.15) * 9)/5) + 32);
  }
}
