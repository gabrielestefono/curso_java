import java.util.Scanner;
import programa.Conversor;

public class App{
  public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)){
      Conversor conversor = new Conversor();
      conversor.mostrarPrimeiroConsole(sc);
    }
  }
}
