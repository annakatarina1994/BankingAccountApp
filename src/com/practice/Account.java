package com.practice;

public abstract class Account implements IBaseRate {

    public Account(String name){
        System.out.println("NAME: " + name);
        System.out.println("NEW ACCOUNT");
    }
}
