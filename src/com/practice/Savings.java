package com.practice;

public class Savings extends Account{
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = 1 + accountNumber;
        setSafetyDepositBoxID();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBoxID(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("Savings Account Features: " +
                "\n     Safety Deposit Box ID: " + safetyDepositBoxID +
                "\n     Safety Deposit Box Key: " + safetyDepositBoxKey);
    }
}
