package com.stackroute;

import java.util.*;
import java.util.ArrayList;

public class Main {
    static List<String> list = new ArrayList<String>(); //This an static list it can be acess anywhere inside class in order to store the values
    static int flag = 0;

    public static void main(String[] args) {
        list.add("Nike");
        list.add("Puma");
        list.add("Adidas");
        list.add("SuperDry");//We are adding values into list
        list = catalogListSorter(list);     //here we are calling static method by passing list as argument inorder to sort list according to alphabtical order.
        System.out.println(catalogListSearcher("Puma"));//here we are calling catalogListSearcher in order to find the value in list.
        System.out.println(catalogListSearcher(null));//Here we are passing null as argument then return error message.
        list.add(null);
        list = catalogListSorter(list);//Here we are passing list that contain null in list so it returns null
        List<String> nullList = new ArrayList<String>();
        list = catalogListSorter(nullList);//here we passing empty list to sort  it so it should return error message.
    }
/*
This method is going to do this requirements
- Should take a String as input and display a string as result

     - Should display an error message when the String is null or empty or blank space

     - Should iterate the sorted list to check String existence and display Found or Not Found
 */


    static List<String> catalogListSorter(List<String> list) {
        if (list.size() == 0) { //This condition is used to check whether list is empty if empty print error message
            System.out.println("The catalogList is Empty");
            flag = 1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null || list.get(i).matches("^[ ]*$")) { //This condition is used to check if list contains null value or blankspaces if thats the case then it print error message.
                System.out.println("This catalogList contains empty or null or blankspace  as a value");
                flag = 1;
                return list;

            }
        }
        Collections.sort(list); //sort() is an predefined method present in COllections as static method so we are calling dirctlywith its class name.
        return list;
    }
/*
  - Should validate the List and return error message when it is null or empty and contains value like empty or blank space or null
      - Should sort the List using Collections

 - Should return the global class List variable
 */
    static String catalogListSearcher(String value) {
        if (value == null || value.length() == 0)
            return "input is not accepted";
        Iterator itr = list.iterator();//iterator which is used travasal elements into list.
        int f = 0;
        while (itr.hasNext()) { //has.Next() method is used to check whether next element present or not it return boolean value.
            if (itr.next() == value)//itr.next value is used to read element by element in list.
                f = 1;
        }
        if (f == 0)
            return "NotFound";  //these condions are used to check whether item found or not.
        else
            return "Found :" + value;
    }

}
