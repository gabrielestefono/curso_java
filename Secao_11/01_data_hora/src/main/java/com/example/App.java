package com.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App{
  public static void main( String[] args ){
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();
    LocalDate d04 = LocalDate.parse("2024-05-31");
    LocalDateTime d05 = LocalDateTime.parse("2024-05-31T10:00:00");
    Instant d06 = Instant.parse("2024-05-31T10:00:00Z");
    Instant d07 = Instant.parse("2024-05-31T10:00:00-03:00");
    LocalDate d08 = LocalDate.parse("31/05/2024", fmt1);
    LocalDateTime d09 = LocalDateTime.parse("31/05/2024 10:00", fmt2);
    LocalDate d10 = LocalDate.of(2024, 5, 31);
    LocalDateTime d11 = LocalDateTime.of(2024, 7, 20, 1, 30);


    System.out.println(d01);
    System.out.println(d02);
    System.out.println(d03);
    System.out.println(d04);
    System.out.println(d05);
    System.out.println(d06);
    System.out.println(d07);
    System.out.println(d08);
    System.out.println(d09);
    System.out.println(d10);
    System.out.println(d11);
  }
}
