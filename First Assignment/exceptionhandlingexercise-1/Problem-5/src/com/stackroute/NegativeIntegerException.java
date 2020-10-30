package com.stackroute;
//This Exception Class is used when user gives -ve value to withdraw.
public class NegativeIntegerException extends Exception{
    String msg;

    public NegativeIntegerException(String msg) {
        this.msg = msg;//it is an constructor used to set msg user thrown
    }

    @Override
    public String toString() {
        return "NegativeIntegerException{" +
                "msg='" + msg + '\'' +//this method is used to get exception message thrown.
                '}';
    }
}
