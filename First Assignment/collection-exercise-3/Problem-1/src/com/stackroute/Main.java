package com.stackroute;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String input = "one one -one___two,,three,one @three*one?two";
        String strings[] = input.split("[\\W_]+");//Here we are splliting a string by using regular expression \\W which matches
        // nonAlphabtes _ when ever non alphabet and_ symbol occurs string is going to split and it return an array of String
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            map.put(s, 0);  //Here we are storing numbers in string format into an array as key and assigning intial count as 0.
        }
        for (String string : strings) {
            map.put(string, map.get(string) + 1);//Here we are counting Number string occurances in an a string.
        }
        System.out.println(map);
    }
}