package com.stackroute;

import java.util.Arrays;
/*
Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
Input:India
Output:Place Name without Vowels:0 Ind
 */
import java.util.Scanner;
import java.lang.*;

public class PlaceVowels {

    public static void main(String[] args) {
        // Taking Array length and places into array from user.
        Scanner in = new Scanner(System.in);
        System.out.print("Could You please Enter How Many citys You Want: ");
        int length = in.nextInt();
        String places[] = new String[length];
        for (int i = 0; i < length; i++) {
            places[i] = in.next();
        }


        String consonant[] = new String[length];
        for (int i = 0; i < length; i++) {
            String place = places[i], empty = "";    //Taking each place from places array
            for (int j = 0; j < place.length(); j++) {
                //Taking indvidual character form place string and converting it into lowercase by//
                // by using toLowerCase() method because it can be essay to compare whether character is vowel or not.
                char character = Character.toLowerCase(place.charAt(j));
                if (character != 'a' && character != 'o' && character != 'i' && character != 'e' && character != 'u' && character != ' ')
                    empty += character;
            }
            consonant[i] = empty;
        }
        for (int i = 0; i < consonant.length; i++) {
            System.out.println("Place Name Without Vowels:" + i + " " + consonant[i]);
        }

    }
}
