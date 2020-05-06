package com.practice;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = 2 + accountNumber;
        setDebitCardNumber();
    }

    @Override
    public void setRate(){
        rate = getBaseRate() * .15;
    }

    private void setDebitCardNumber(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("Checking Account Features: " +
                "\n     Debit Card Number: " + debitCardNumber +
                "\n     Debit Card PIN: " + debitCardPin);
    }
}
