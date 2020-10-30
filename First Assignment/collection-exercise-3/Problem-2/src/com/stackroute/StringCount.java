package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

    public static void main(String[] args) {
        // write your code here
        String strings[] = {"a", "b", "c", "b", "a", "c", "d", "c"};//Here we are intializing string array with strings.
        System.out.println(wordCount(strings));

    }

    static Map<String, Boolean> wordCount(String strings[]) {
        Map<String, Integer> countMap = new HashMap<String, Integer>();//creating map to store string with respective their count
        Map<String, Boolean> booleanMap = new HashMap<String, Boolean>();//creating map to store string as key and value as boolean value
        for (String string : strings) {
            countMap.put(string, 0);    //here we are adding strings to to map by intializing its value with 0.
        }
        for (String string : strings) {
            countMap.put(string, countMap.get(string) + 1);//Here we are counting string occurance in string array.
        }
        for (String key : countMap.keySet()) {//here we are getting all keys from count map.
            if (countMap.get(key) >= 2)//checking the count of each occurance of string if count is greater or equal to 2 then boolean value of particula string is set to be true otherwise set to false.
                booleanMap.put(key, true);
            else
                booleanMap.put(key, false);
        }
        System.out.println("Input: "+countMap);
        return booleanMap;//returning booleanMap in which consists of string with respective boolean value.

    }

}
