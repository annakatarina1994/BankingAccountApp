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
        setRate();
    }

    public abstract void setRate();

    //Set account number (Starts with 1 for savings, 2 for checking; last two digits of SSN,
    // unique 5 digit number and random 3 digit number
    private String setAccountNumber(){
        String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void deposit(double depositAmount){
        balance = balance + depositAmount;
        System.out.println("Depositing: $" + depositAmount);
        printBalance();
    }

    public void withdraw(double withdrawalAmount){
        balance = balance - withdrawalAmount;
        System.out.println("Withdrawing: $" + withdrawalAmount);
        printBalance();
    }

    public void transfer(String toWhere, double transferAmount){
        balance = balance - transferAmount;
        System.out.println("Transferring: $" + transferAmount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is now: $" + balance);
    }

    public void showInfo(){
        System.out.println("NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%");
    }
}
