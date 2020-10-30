package com.stackroute;

/*
In order to define Custom Exceptions or user defined exception first we need to inherit the exception class and then
we can define user define exceptions class name and then we are creating a constructors to call when exception arises an exception is called by using
throw key word followed with calling instance then based on argument the matched constructor is going to called.
 */
public class UserDefinedException extends Exception {
    String msg; //here we are define instance variable to store exception

    public UserDefinedException(String msg) {
        this.msg = msg;         //Here we are assigning exception mesage thrown by throw keyword then it assigned to msg.
    }

    @Override
    public String toString() {
        return "UserDefinedException{" + "msg='" + msg + '\'' + '}';//This method is used to get the exception message.
    }

    /*
    Try is an block which is used place a code where exception is rising or exceptions are thrown and rised exceptions or thrown exceptions
    need to be handled immedateily by catch block where exception is going to catch of particular class type
    and in some cases we can write try followed by finally block finally block works differently finally block get executed at any cost.
     */
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is user defined exception");//here we are throwing a userdefined exception where it is already defined
        } catch (UserDefinedException e)//it is an catch block where thrown exception gets handled in catch block
        {
            System.out.println(e.toString());//where while catching of exception of type class with reference of class we are getting exception message .
        } finally {//This block get executed at any cost whether exception in try block handled or not it will get executed here we keep code which should be executed mandtory thing are kept in this block.
            System.out.println("\nHey I am Final Block I don't care whether Exception handled or not I will Execute.");
        }
    }
}
