package com.example;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App{
  public static void main( String[] args ){
    LocalDate d04 = LocalDate.parse("2024-05-31");
    LocalDateTime d05 = LocalDateTime.parse("2024-05-31T10:00:00");
    Instant d06 = Instant.parse("2024-05-31T01:30:00Z");

    LocalDate pastWeekLocalDate = d04.minusDays(7);
    LocalDate nextWeekLocalDate = d04.plusDays(7);
    
    System.out.println(pastWeekLocalDate);
    System.out.println(nextWeekLocalDate);

    LocalDateTime pastWeekLocalDate2 = d05.minusDays(7);
    LocalDateTime nextWeekLocalDate2 = d05.plusDays(7);
    
    System.out.println(pastWeekLocalDate2);
    System.out.println(nextWeekLocalDate2);

    Instant pastWeekLocalDate3 = d06.minus(7, ChronoUnit.DAYS);
    Instant nextWeekLocalDate3 = d06.plus(7,ChronoUnit.DAYS);
    
    System.out.println(pastWeekLocalDate3);
    System.out.println(nextWeekLocalDate3);

    Duration t1 = Duration.between(pastWeekLocalDate2, nextWeekLocalDate2);
    System.out.println(t1.toDays());
  }
}
