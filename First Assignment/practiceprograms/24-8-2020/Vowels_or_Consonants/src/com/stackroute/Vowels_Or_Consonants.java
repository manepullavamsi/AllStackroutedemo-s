package com.stackroute;
import java.util.Scanner;
import java.lang.Character;
public class Vowels_Or_Consonants {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        System.out.print("Please Enter a String to check whether it's Third character is vowel or Consonant");
        String s=in.next();
        char c=s.charAt(2);
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            System.out.println("Congratulations Third Character of String is Vowel and character is: "+c+"\"");
        else
            System.out.println("\"Congratulations Third Character of String is Consonant and character is: "+c+"\"");
    }
}
