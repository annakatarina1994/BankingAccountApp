package com.practice;

import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        String file = "C:\\Users\\Beelzebud\\Downloads\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = Utilities.CSV.read(file);

        for(String[] accountHolder : newAccountHolders) {
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }


//	Checking checking1 = new Checking("John Johnson", "115236565", 1500);
//    Savings savings1 = new Savings("Robert Roberts", "844985999", 2550);
//
//
//    savings1.showInfo();
//    System.out.println("***************************************************************");
//    checking1.showInfo();



    }
}
