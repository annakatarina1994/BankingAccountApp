package com.practice;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = 2 + accountNumber;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
    }
}
