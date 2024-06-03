package com.example;

import com.example.entities.Account;
import com.example.entities.BusinessAccount;
import com.example.entities.SavingsAccount;

public class App{
  public static void main( String[] args ){
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    // UPCASTING
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
    System.out.println(acc1.getBalance());
    System.out.println(acc2.getBalance());

    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
    System.out.println(acc3.getBalance());

    // DOWNCASTING

    BusinessAccount acc4 = (BusinessAccount)acc2;
    acc4.loan(100.0);

    if(acc3 instanceof BusinessAccount){
      BusinessAccount acc5 = (BusinessAccount)acc3;
      acc5.loan(100.0);
      System.out.println("Empréstimo feito!");
    }

    if(acc3 instanceof SavingsAccount){
      SavingsAccount acc5 = (SavingsAccount)acc3;
      acc5.updateBalance();
      System.out.println("Update!");
    }
  }
}
