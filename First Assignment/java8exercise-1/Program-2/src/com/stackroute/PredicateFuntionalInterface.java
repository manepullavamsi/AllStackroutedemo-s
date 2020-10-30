package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class PredicateFuntionalInterface {
    /*
    It is a functional interface where we have only one method inside an interface
     */
   public  interface PredicateStartsWithI{
        boolean isStartsWithI(String S);
    }
    public static void main(String[] args) {
	// write your code here
        List<String> items1=new ArrayList<String>();   //It is an arraylist where we have inputs where strings starts with I
        items1.add("IceCream");
        items1.add("ice");
        items1.add("Iam");
        System.out.println("Input1 :with elements "+items1);
        System.out.println(findpattern(items1)); //calling a method to find whether list contains strings start with I
        List<String> items2=new ArrayList<String>();
        items2.add("Cream");
        items2.add("ceramic");
        items2.add("java");
        System.out.println("Input2 with elements "+items2);
        System.out.println(findpattern(items2));//here we are passing list contains where list doesnot contain string start with I
        List<String> items3=new ArrayList<String>();
        System.out.println("input is empty list "+items3);
        System.out.println(findpattern(items3));//Here we are passing list is empty.
    }

   public static List<String> findpattern(List<String> strings)
    {
        PredicateStartsWithI isStartsWithI = S-> S.startsWith("I")||S.startsWith("i");
        List<String> update = new ArrayList<String>();//creating a list to store updated values.
        if(strings.size()==0)//if input list is empty then we are returning empty list
            return update;
        for(int i=0;i<strings.size();i++) //This loop is used to traversal every element in inputlist
        {
            if(isStartsWithI.isStartsWithI(strings.get(i)))//This condition is used to check whether partcular element in list start
            {
                if(!update.contains(strings.get(i)))
                    update.add(strings.get(i));
            }
        }
        return update;
    }
}
