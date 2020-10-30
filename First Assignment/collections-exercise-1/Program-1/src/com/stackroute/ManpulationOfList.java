package com.stackroute;

import java.util.ArrayList;

public class ManpulationOfList {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> fruits=new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Guva");
        fruits.add("SugarCane");
        System.out.println(fruits);
        fruits.set(0,"JackFruit");
        System.out.println(fruits);
        fruits.removeAll(fruits);
        System.out.println(fruits);
    }
}
