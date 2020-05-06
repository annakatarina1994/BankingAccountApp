package com.practice;

public class BankAccountApp {

    public static void main(String[] args) {
	Checking checking1 = new Checking("John Johnson", "115236565", 1500);
    Savings savings1 = new Savings("Robert Roberts", "844985999", 2550);
    savings1.showInfo();
    System.out.println("***************************************************************");
    checking1.showInfo();

    savings1.deposit(1000);
    savings1.withdraw(254);
    savings1.transfer("Mom", 323);
    }
}
