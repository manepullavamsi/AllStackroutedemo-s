package com.stackroute;

/*
Exceptions are two types  Checked Exceptions and runtime Unchecked Exceptions
Checked Exceptions:
            These are Exceptions where compiler find while compiling the code EX:while usinf File handling throws IOException
UnChecked Exceptions:
            These are Exceptions where compiler can't identify these exception rise while runtime EX:Array indexoutof bounds.
 */
public class UnCheckedExceptions {

    public static void main(String[] args) {
        String strings[] = {"Vamsi", "Lucky", "Bittu", "Bujji"};
        //Here we are assigning -ve value to an array size which throws runtime error called NegativeArraySizeException.
        try {
            Integer number[] = new Integer[-3];
        } catch (NegativeArraySizeException ne) {
            System.out.println("This is Negative array size exception " + ne.toString());
        }
        //Here we are getting array index out of bound exception while try to access the array with more than size of an array.
        try {
            System.out.println(strings[4]);
        } catch (ArrayIndexOutOfBoundsException ne) {
            System.out.println("This is Negative array size exception " + ne.toString());
        }
        //Here we are get null pointer exception because a reference null and we trying to access toString() method
        // with that reference it will throw nullpointer exception.
        try {
            UnCheckedExceptions ref = null;
            ref.toString();
        } catch (NullPointerException ne) {
            System.out.println("This is Negative array size exception " + ne.toString());
        }
    }
}
