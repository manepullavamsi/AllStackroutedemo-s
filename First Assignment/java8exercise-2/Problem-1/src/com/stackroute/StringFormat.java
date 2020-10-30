package com.stackroute;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringFormat {

    public static void main(String[] args) {
	// write your code here
        List<Integer> numbers= new ArrayList<Integer>();
        List<Integer> emptyList= new ArrayList<Integer>();
        List<Integer> negativeElementList= new ArrayList<Integer>();
        for(int i=1;i<6;i++)
            numbers.add(i); //In this loop we are adding values to list.
        negativeElementList.add((30));
        negativeElementList.add(-2);
        negativeElementList.add(3);
        System.out.println(findStringFormat(numbers)); //Here we are calling method to get number with it's string type whether number is even or odd.
        System.out.println(findStringFormat(emptyList));//passing empty list which return error message.
        System.out.println(findStringFormat(negativeElementList));//Where list contains negative values which will return error message.
    }
    /*                  These are requirements and constraints of method
    -Should accept list of integers as input and return String

     -Should find the comma separated string format for on a given list of integers

     -Should return "Give proper input not empty list" if list is empty

     -Should return "Give proper input not negative values" if list contains negative values
     NOTE: The Streams can be used only once for an operation where we can't use single stream for multiple operations
     where piping concept can be achived in java by using streams and it is realized in Java-8 version.
     */
    static String findStringFormat(List<Integer> numbers)
    {
        Stream<Integer> numberStream1=numbers.stream(); //Here we are converting list into list into stream to check whether stream is empty or not
        Stream<Integer> numberStream2=numbers.stream();//This is to check whether list contains negative values or not.
        Stream<Integer> numberStream3=numbers.stream();//This is used to extract even numbers
        Stream<Integer> numberStream4=numbers.stream();//this is used to  extract odd numbers from stream or list.
        if(numberStream1.count()==0)
            return "Give Proper input not Empty List";//This condition is used to check whether list is empty or not if empty then it return error message
        if(numberStream2.anyMatch(num->num<0))//here we are using anyMatch method which is used to find -ve values anyone
            return "Give proper input not negative";//This condition is used check -ve values in stream if exists then it return error message
        String even=numberStream3.filter((n->n%2==0)).map(s-> " Even: "+String.valueOf(s)).collect(Collectors.joining());//Here we are filtering and Even numbers with the help of filter and then we are converting even number into string and concatenating EVEN word to string then it going to collect in the form of string with the help of joining method.
       String  odd=numberStream4.filter(n->n%2!=0).map(s-> " Odd: "+String.valueOf(s)).collect(Collectors.joining());//Here we are filtering and Odd numbers with the help of filter and then we are converting odd number into string and concatenating odd word to string then it going to collect in the form of string with the help of joining method.
        return even+" "+odd;//Here we are concatenating even String and odd string and returning whole value.
    }

}
