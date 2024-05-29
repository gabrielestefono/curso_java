package com;
public class App{


  public static void main( String[] args ){
    int n = 3;
    double[] vect = new double[n];
    vect[0] = 1.72;
    vect[1] = 1.56;
    vect[2] = 1.80;
    double sum = 0.0;
    for(int i = 0; i < n; i++){
      sum += vect[i];
    }
    double avg = sum / n;
    System.out.println(avg);
  }
}
