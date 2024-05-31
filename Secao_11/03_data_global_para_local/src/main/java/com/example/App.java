package com.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App{
  public static void main( String[] args ){
    // for(String s : ZoneId.getAvailableZoneIds()){
    //   System.out.println(s);
    // }

    LocalDate d04 = LocalDate.parse("2024-05-31");
    LocalDateTime d05 = LocalDateTime.parse("2024-05-31T10:00:00");
    Instant d06 = Instant.parse("2024-05-31T01:30:00Z");

    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
    LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));


    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);

    System.out.println(d05.getMonthValue());

    System.out.println(d04.getDayOfMonth());
    System.out.println(d04.getMonthValue());
    System.out.println(d04.getYear());
  }
}
