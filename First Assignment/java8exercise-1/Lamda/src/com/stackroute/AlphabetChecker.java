package com.stackroute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlphabetChecker {
//    This is Functional interface from java8 an interface which has only single method then it is said to be functional interface
    interface Lamda{
      boolean isAlphabet(String Values);
    }
    public static void main(String[] args) {
        ArrayList<String > strings1=new ArrayList<String>();//This list contains Strings only alphabets.
        strings1.add("Java");
        strings1.add("python");
        System.out.println(checkAlphabets(strings1));
        ArrayList<String > strings2=new ArrayList<String>();//This list contains alphabets with special characters.
        strings2.add("C++");
        strings2.add(".net");
        System.out.println(checkAlphabets(strings2));
        ArrayList<String > strings3=new ArrayList<String>();//This is an empty list.
        System.out.println(checkAlphabets(strings3));
    }
    public static String checkAlphabets(ArrayList<String> strings)
    {
        if(strings.size()==0)//This condition is used to check whether list contains strings or not.
            return "Please Give proper input not empty list";
        Iterator itr = strings.listIterator();//This Iterator is used to iterate all elements arraylist
        Lamda isAlphabet= s-> s.matches("^[A-Za-z]*$");
        while(itr.hasNext())//hasNext is an method which return bollean value when itr pointer has next value to read then it return true otherwise false.
        {
            String string=(String)itr.next();//This next() method is used to read element by element  in a list provided to iterator reference.
            if(isAlphabet.isAlphabet(string))
            {
                itr.remove();
            }
        }
        if(strings.size()==0)
            return "Given String contain only AlphabetCharacters.";
        else
            return "Given String contain AlphabetCharacters and Special Characters ";

    }
}
