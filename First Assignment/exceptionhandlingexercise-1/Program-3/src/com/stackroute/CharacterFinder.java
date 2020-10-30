package com.stackroute;

/*
Here we are implementing single try with multiple catch blocks are considered and we are handling multiple exceptions
where single try block can throw multiple type of exception and
and runtime exception start to search for related catch block if no catch block match exception then program terminates abnormally
 */
public class CharacterFinder {

    public static void main(String[] args) {
        // write your code here
        System.out.println(characterLocator("Om Namo Venkateshwara", "3"));//Here we are giving proper input
        System.out.println(characterLocator("Om Namo Venkateshwara", "abc"));//Here we are giving index as alphabets which throw number format exception.
        System.out.println(characterLocator("Om Namo Venkateshwara", "50"));//here index is given more than string length then it rises an exception string indexoutof bound exception.
    }

    public static Character characterLocator(String string, String num) {
        try {
            return string.charAt(Integer.parseInt(num));
        } catch (NumberFormatException ne)//This catch block only habndle when Numberformat exception arises
        {
            System.out.println(ne);
        } catch (StringIndexOutOfBoundsException siob)//This catch block works only when exception rise on string index out of bound.
        {
            System.out.println(siob);
        }
        return null;
    }
}
