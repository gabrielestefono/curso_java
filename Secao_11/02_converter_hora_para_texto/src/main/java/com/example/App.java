package com.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App{
  public static void main( String[] args ){
    LocalDate d04 = LocalDate.parse("2024-05-31");
    LocalDateTime d05 = LocalDateTime.parse("2024-05-31T10:00:00");
    Instant d06 = Instant.parse("2024-05-31T13:45:00Z");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    System.out.println(d04.format(fmt1));
    System.out.println(fmt2.format(d05));
    System.out.println(fmt3.format(d06));
  }
}
