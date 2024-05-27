package programa;

import java.util.Scanner;

public class Conversor {
  private static final String FAHRENHEIT = "Fahrenheit";
  private static final String KELVIN = "Kelvin";
  private static final String CELCIUS = "Celcius";
	private static final String RESULTADO = "O resultado é de ";

  public Conversor(){
    // Empty Constructor
  }

  public void mostrarMensagem(String mensagem){
    System.out.println(mensagem);
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
        this.mostrarMensagem(String.valueOf(temperatura));
      }
      case "12" -> {
        temperatura = this.mostrarSegundoConsole(sc, FAHRENHEIT);
        String resultado = this.fahrenheitToKelvin(temperatura);
        this.mostrarMensagem(RESULTADO + entrada + " graus em " + FAHRENHEIT + " é: " + resultado + KELVIN);
      }
      case "13" -> {
        temperatura = this.mostrarSegundoConsole(sc, FAHRENHEIT);
        String resultado = this.fahrenheitToCelcius(temperatura);
        this.mostrarMensagem(RESULTADO + entrada + " graus em " + FAHRENHEIT + " é: " + resultado + CELCIUS);
      }
      case "21" -> {
        temperatura = this.mostrarSegundoConsole(sc, KELVIN);
        String resultado = this.kelvinToFahrenheit(temperatura);
        this.mostrarMensagem(RESULTADO + entrada + " graus em " + KELVIN + " é: " + resultado + FAHRENHEIT);
      }
      case "22" -> {
        temperatura = this.mostrarSegundoConsole(sc, KELVIN);
        this.mostrarMensagem(String.valueOf(temperatura));
      }
      case "23" -> {
        temperatura = this.mostrarSegundoConsole(sc, KELVIN);
        String resultado = this.kelvinToCelcius(temperatura);
        this.mostrarMensagem(RESULTADO + entrada + " graus em " + KELVIN + " é: " + resultado + CELCIUS);
      }
      case "31" -> {
        temperatura = this.mostrarSegundoConsole(sc, CELCIUS);
        String resultado = this.celciusToFahrenheit(temperatura);
        this.mostrarMensagem(RESULTADO + entrada + " graus em " + CELCIUS + " é: " + resultado + FAHRENHEIT);
      }
      case "32" -> {
        temperatura = this.mostrarSegundoConsole(sc, CELCIUS);
        String resultado = this.celciusToKelvin(temperatura);
        this.mostrarMensagem(RESULTADO + entrada + " graus em " + CELCIUS + " é: " + resultado + KELVIN);
      }
      case "33" -> {
        temperatura = this.mostrarSegundoConsole(sc, CELCIUS);
        this.mostrarMensagem(String.valueOf(temperatura));
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
