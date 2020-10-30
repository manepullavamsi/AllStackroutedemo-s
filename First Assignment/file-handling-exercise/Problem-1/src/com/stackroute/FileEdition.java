package com.stackroute;
/*
Problem Statement: Read and add content to a file

**Given a filename and content read the file and add the content in the file using fileInputStream and try with resources**

 */
import java.io.*;

public class FileEdition {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println(fileEditor("abc.txt", "Vamsi"));
    }

    public static String fileEditor(String fileName, String content) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            if (content.length() == 0 || content == null || content.contains("    ")) {//checking whether parameter passed properly or not return error msg when methd true.
                return "Please don't enter null or blank spaces or null as a content";
            } else {
                String S = "Hi My Name is " + content;
                byte[] value = S.getBytes();//converting string into bytes
                fileOutputStream.write(value);//by using write method we write data into files in byte array format.
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            int c;
            String result = "";
            while ((c = fileInputStream.read()) != -1) {
                result += (char) c; //This loop read character by character from file
            }
            return result;
        } else {
            return "File \'" + fileName + "\' not Found";
        }
    }
}