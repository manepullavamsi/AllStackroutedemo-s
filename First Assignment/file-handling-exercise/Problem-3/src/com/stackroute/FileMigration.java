package com.stackroute;

import java.io.*;

/*
Problem Statement: Transfer data from one file to another

**Given two file names read the first file and add the content in the second file using bufferedStream and handle exception using throws**
 */
public class FileMigration {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println(fileContentDuplicator("input.txt", "output.txt"));
        System.out.println(fileContentDuplicator("input", "output.txt"));//here input file not presrent then see reult.
        System.out.println(fileContentDuplicator("input.txt", null));//Here the outputfile name is null then we get error message.
        System.out.println(fileContentDuplicator(null, "output.txt"));//same as above case.
    }

    public static String fileContentDuplicator(String inputFile, String outputFile) throws IOException {
        if (inputFile == null || outputFile == null)
            return "Given fileName to read or to write is null";        //In this condition we are checking file name is null if null then returning error String
        File file = new File(inputFile); //File reference of inputfile is created.
        if (!file.exists())      //checking whether file exists or not.
            return "File Not Found";
        if (file.length() == 0)       //checking is file has content or empty file
            return "file to read is empty please check it once";

        FileInputStream fileInputStream = new FileInputStream(file);//passing file class reference to fieinputStream class.
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);//passing fileinputstream refernce because it doesnt accept file refrence to read content from file.
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int c;
        String line = "";
        while ((c = bufferedInputStream.read()) != -1) { //inthis loop we are reading character by character and eacg character is appended to string which is intally empty.
            line += (char) c;
        }
        byte[] bytes = line.getBytes();       //converting string into array of bytes
        bufferedOutputStream.write(bytes);  //bufferoutputstream accepts only int  format parameter.
        bufferedInputStream.close();//here we are closing buffered input and output.
        bufferedOutputStream.close();
        return line;//the content of input file is returning.
    }
}
