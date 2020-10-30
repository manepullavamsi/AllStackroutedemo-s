package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program to count how many numbers of times each character appears/present in the given string.
* */
public class CharacterCount {
    public static void main(String[] args) {
        System.out.println("Could you Please Enter the String");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();//Here user input is taken.
        System.out.print(input);
        char characters[] = new char[input.length()];
        for (int i = 0, j = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ')
                characters[j++] = ch;
        }
        char uniqueCharacters[] = uniqueChar(characters);
        countCharacters(uniqueCharacters, characters);

    }

    /*Uniquechar method is used to get unique chracters from an character array .
     * */
    public static char[] uniqueChar(char[] character) {
        String s = "";
        for (int i = 0; i < character.length; i++) {
            if (s.indexOf(character[i]) == -1)
                s += character[i];
        }
        char uniqueChar[] = s.toCharArray();
        return uniqueChar;
    }

    //Countchracters method is used to count the all chracters in unique array and count is stored in count integer array
// and then we are print count of each character stored in count array.
    public static void countCharacters(char unique[], char character[]) {
        int count[] = new int[unique.length];
        for (int i = 0; i < unique.length; i++) {
            int c = 0;
            for (int j = 0; j < character.length; j++) {
                if (unique[i] == character[j])
                    c++;
            }
            count[i] = c;
        }
        System.out.print("\n");
        for (int i = 0; i < count.length; i++) {
            System.out.println(unique[i] + "......." + count[i]);
        }
    }
}




