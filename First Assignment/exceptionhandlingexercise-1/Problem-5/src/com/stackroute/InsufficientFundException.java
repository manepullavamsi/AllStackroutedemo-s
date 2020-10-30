package com.stackroute;
//This Exception Class is used when user gives  value greater than present in his account then insufficient balance exception is thrown to withdraw.
public class InsufficientFundException  extends Exception{

String msg;

    public InsufficientFundException(String msg) {
        this.msg = msg;//it is an constructor used to set msg user thrown
    }

    @Override
    public String toString() {
        return "InsufficientFundException{" +
                "msg='" + msg + '\'' +
                '}';//this method is used to get exception message thrown.
    }
}
