package com;

import com.entities.Product;

/**
 * Hello world!
 *
 */
public class App{
  public static void main( String[] args ){
    int n = 5;
    Product[] vect = new Product[n];

    for(int i = 0; i < n; i++){
      String name = "Produto" + i;
      double price = (double) 20 * i;
      vect[i] = new Product(name, price);
      System.out.println(vect[i].toString());
    }

    double soma = 0;
    for(int i = 0; i < n; i++){
      soma += vect[i].getPrice();
    }

    System.out.println(soma);

    double avg = soma / n;

    System.out.println(avg);
  }
}
