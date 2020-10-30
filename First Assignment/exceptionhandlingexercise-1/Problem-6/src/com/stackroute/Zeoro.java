package com.stackroute;

public class Zeoro extends Exception{
    String msg;

    public Zeoro(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Zeoro{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
