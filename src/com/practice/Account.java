package com.practice;

public abstract class Account implements IBaseRate {

    String name;
    String ssn;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String ssn, double initDeposit){
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
    }
    //Set account number
    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void showInfo(){
        System.out.println("NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance);
    }
}
