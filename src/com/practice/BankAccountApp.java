package com.practice;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();


        String file = "C:\\Users\\Beelzebud\\Downloads\\NewBankAccounts.csv";
        List<String[]> newAccountHolders = Utilities.CSV.read(file);

        for(String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
//            System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);
            if(accountType.equals("Savings")){
                accounts.add(new Savings(name, ssn, initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, ssn, initDeposit));
            }else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

         for (Account account : accounts){
             System.out.println("\n********************");
            account.showInfo();
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
