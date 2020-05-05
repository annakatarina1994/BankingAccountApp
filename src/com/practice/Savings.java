package com.practice;

public class Savings extends Account{
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = 1 + accountNumber;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
    }
}
