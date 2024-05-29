package com.example;

import java.util.Scanner;

import com.example.entities.Numero;
public class App{
  public static void main( String[] args ){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Por favor, digite um numero: ");
      int numero = sc.nextInt();
      Numero number = new Numero(numero);
      System.out.println(number.toString());
    }
  }
}
