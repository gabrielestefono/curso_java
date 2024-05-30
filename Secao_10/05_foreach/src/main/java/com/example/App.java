package com.example;

/**
 * Hello world!
 *
 */
public class App{
  public static void main( String[] args ){
    String[] vect = new String[] {"Maria", "Bob", "Alex"};
    /* Forma normal */
    for(int i = 0; i < vect.length; i++){
      System.out.println(vect[i]);
    }

    /*
     * Forma correta
     */
    for(String obj : vect){
      System.out.println(obj);
    }
  }
}
