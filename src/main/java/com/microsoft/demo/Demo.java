package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered--hello world");
            return;
        }

        System.out.println("I am not covered-hello world not");
    }
}
