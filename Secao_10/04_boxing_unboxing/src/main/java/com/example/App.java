package com.example;

public class App{
  public static void main( String[] args ){
    int x = 20;

    Object obj = x;

    System.out.println(obj);

    int y = (int) obj;

    System.out.println(y);

    int x2 = 20;

    Integer obj2 = x2;

    System.out.println(obj2);

    int y2 = obj2 * 2;

    System.out.println(y2);
  }
}
