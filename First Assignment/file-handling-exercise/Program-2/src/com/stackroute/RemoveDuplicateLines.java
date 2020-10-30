package com.stackroute;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*
## Problem Statement: Read the content from the given file(input.txt) and write the result to another file(output.txt) without redundant lines ##

**Given a file by name input.txt, read content using FileInputStream and write result to file by name output.txt by using FileOutputStream**
 */
public class RemoveDuplicateLines {
    public static void main(String[] args) throws IOException {
        removeDuplicateLines("input.txt", "output.txt");
    }

    public static void removeDuplicateLines(String inputFile, String outputFile) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(inputFile);//refernce of fileinput stream is created.
        String S = "JVM\nJRE\nJDK\nJRE\nJVM";//string that need to be added into input file with duplicates.
        byte[] inputBytes = S.getBytes();//Converting above string into arrayBytes because inputstream.write accepts only int type
        fileOutputStream.write(inputBytes);//Here we are writing string .
        FileInputStream fileInputStream = new FileInputStream(inputFile);//To read input file.
        int c, i = 0;
        ArrayList<String> lines = new ArrayList<String>(); //To Store each line of file.
        String line = "";//lines array to store every line of an file.
        while ((c = fileInputStream.read()) != -1) {
            if ((char) c != '\n') {
                line += (char) c;            //Here we are concating each character to string
            } else {
                if ((char) c == '\n')   //when ever we encounter new line character then we are adding line to array list by using add method.
                    lines.add(line);
                line = "";
            }
        }
        lines.add(line);    //for last line in file we can't encounter new line character so we are adding last line of file after completion.
        System.out.println(lines);
        HashSet<String> h = new HashSet<String>();//Here we using hashset datatype because it has special feature i.e., it store only unique values.
        File file = new File(outputFile);
        FileOutputStream fileOutputStream1 = new FileOutputStream(file);
        for (int j = 0; j < lines.size(); j++) {
            String v = lines.get(j);
            if (h.add(v)) {                 //In this we are navigating all ines of file stored in arraylist and in if condtion where the line is already present in set or not if not present then add method returns bollean value if value added then we are adding that particular linre to the outputfile wher duplicate lines are removed.
                String S1 = v + "\n";
                byte[] bytes = S1.getBytes();
                fileOutputStream1.write(bytes);
            }
        }
        System.out.println(h);
    }
}