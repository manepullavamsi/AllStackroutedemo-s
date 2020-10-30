package com.stackroute;

public class Negative extends Exception {
    String msg;

    @Override
    public String toString() {
        return "Negative{" +
                "msg='" + msg + '\'' +
                '}';
    }

    public Negative(String msg) {
        this.msg = msg;
    }
}
