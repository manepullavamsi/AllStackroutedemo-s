package com.stackroute;

import java.util.Scanner;

public class Account {
    static Double accountBalance;
//constructor and setter and getter are created for account balance.
    public Account(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static void main(String[] args) throws InsufficientFundException,NegativeIntegerException
    {
        Account account=new Account(10000.0);
        System.out.println("Avaliable balance after withdraw is "+withdraw(5000.0));
        System.out.println("Avaliable balance "+withdraw(-5000.0));
        System.out.println("Avaliable balance "+withdraw(55000.0));
    }
    public static Double withdraw(Double withdrawAmount)throws InsufficientFundException,NegativeIntegerException
    {

            if(withdrawAmount<0)
                throw new NegativeIntegerException("Please Enter valid amount to withdraw.");//here throwing an exception negativeintegerexception
            if(accountBalance<withdrawAmount)//Here we are throwhing insufficent funds exception
                throw new InsufficientFundException("You are trying to with draw more than present in your account please make sure.");
            accountBalance=accountBalance-withdrawAmount;
            
        return accountBalance;//returning current balance or remaining balance.
    }
}
