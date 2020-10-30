package com.stackroute;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
    SortedSet<String> SortedValues=new TreeSet<String>();
    SortedValues.add("Harry");
    SortedValues.add("Oilve");
    SortedValues.add("Alice");  ///Adding values to list in sorted manner but sorted set sort all values in alphabetical order.
    SortedValues.add("Bluto");
    SortedValues.add("Eugene");
    System.out.println(SortedValues);
    ArrayList<String> Values=new ArrayList<String>();
    Values.addAll(SortedValues);
    System.out.println(Values);
    }

}
