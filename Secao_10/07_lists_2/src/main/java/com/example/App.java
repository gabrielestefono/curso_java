package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App{
  public static void main( String[] args ){
    String separador = "---------------------------";
    List<String> list = new ArrayList<>();
    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add(2, "Marco");

    for (String x : list) {
      System.out.println(x);
    }
    System.out.println(separador);
    System.out.println(list.size());
    System.out.println(separador);


    list.remove("Anna");

    for (String x : list) {
      System.out.println(x);
    }
    System.out.println(separador);

    list.remove(1);

    for (String x : list) {
      System.out.println(x);
    }
    System.out.println(separador);

    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list) {
      System.out.println(x);
    }
    System.out.println(separador);
    list.removeIf(x -> x.charAt(0) == 'M');

    System.out.println(list.indexOf("Bob"));
    System.out.println(list.indexOf("Marco"));
    System.out.println(separador);
  }
}
