package com;

import java.util.Scanner;

public class App{
  public static void main( String[] args ){
    System.out.println( "Digite um numero de 0 a 10");
    try (Scanner sc = new Scanner(System.in)) {
      Integer valor = sc.nextInt();
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 11; j++){
          switch (i) {
            case 0:
              System.out.println(valor + " * " + j + " = " + (valor * j));
              break;
            case 1:
              if(j != 0) System.out.println(valor + " / " + j + " = " + (valor / j));
              break;
            case 2:
              System.out.println(valor + " + " + j + " = " + (valor + j));
              break;
            case 3:
              System.out.println(valor + " - " + j + " = " + (valor - j));
              break;
            default:
              break;
          }
        }
      }
    }
  }
}
