package com.stackroute;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class NumberUtility {
    @FunctionalInterface
    interface Even {
        boolean predict(Integer number);        //Here we defining functional interface in order to check whether it is even number or not.
    }
    public static void main(String[] args) {
	List<Integer> num=new ArrayList<Integer>();
	    num.add(21);
        for(int i=1;i<=20;i++)
        {
         num.add(i);        //Here we iterating lopp and adding values to integer list
        }
        System.out.println(num);//for our reference what are values in list we are printing list
        System.out.println("Number of Even numbers in a list : "+getEvenNumberCount(num));//Here we are calling a EvenNumberCount() method inorder to get the count how many even number in list.
        System.out.println("List contains even with multiple of 3 : "+getEvenMultiplesOfThree(num));//Here we are calling method EvenMultiplesOfThree() method which is used to get list of all numbers which are even and multiple of 3.
        System.out.println("Maximum of odd number in list : "+getMaximumOfOddNumbers(num));//Here we are calling Maximum of odd numbers in order to get maximum value among odd numbers in a list.
    }
/*
    These are requirements of function.
  - Should take a list of integers as input
  - Should return count of even numbers
  - Should return 0, if the input list is empty or null

 */

    public static long getEvenNumberCount(List<Integer> numbers)
    {
        long count=0l;
        if(numbers.size()==0)
            return count;       //When input list is empty then it is going to return 0

        Stream<Integer> stream=numbers.stream(); // Here we are converting a list of integers into stream of integers.
        Even predict= num-> num%2==0;//here we using lambda function inorder to evulate whether given number is even or odd.
        count=stream.filter((n->predict.predict(n))).count();//Here we filter method which is available for streams which allows value to next method only if it evalutes true.
        return count;//in above we used count() which return how many elements pass filter and finally return count to calling place.
    }
 /*
 These are requirements of function.
 - Should take a list of integers as input
 - Should return a list of integers containing even multiples of 3
 - Should return empty list, if the input list is empty or null
  */
    public static List<Integer> getEvenMultiplesOfThree(List<Integer> numbers)
    {
        List<Integer> multipleOfThree=new ArrayList<Integer>();//ArrayList to store numbers which are even and multiple of 3.
        if(numbers.size()==0)
            return multipleOfThree;             //returns empty list when input list is empty
        Stream<Integer> stream=numbers.stream();//Here we converting a list into streams by using list.stream() method
        Even predict=number -> number%2==0&&number%3==0; //we are writing lamda expression to evaluate the whther it is even and multiple of 3.
        multipleOfThree=stream.filter(n->predict.predict(n)).collect(Collectors.toList());//Here we are using filter to stream the filter is going to filter the numbers which are even and multiple of 3 collect method is used to collect all elements and takes parameter to which type it need to convert..
        return multipleOfThree; //Here we returning a list of numbers which are even and multiple of 3.
    }

/*
These are requirements of this method
- Should take a list of integers as input
- Should return maximum of odd numbers
- Should return 0, if the input list is empty or null
 */
    public static Integer getMaximumOfOddNumbers(List<Integer> numbers)
    {
        if(numbers.size()==0)   //When number list is empty then it return 0.
            return  0;
        Stream<Integer> stream=numbers.stream();//Here we are converting list into stream of integers.
        Even predict=number -> number%2!=0;//Here we are using lambda function to evaluate whether number is odd or not
        Integer count = stream.filter(n->predict.predict(n)).max(Comparator.comparing(Integer::valueOf)).get();//Here we are applying filter to get only odd numbers then we are using max method which compare values to get maximul value among them by using get method.
        return count;
    }
}