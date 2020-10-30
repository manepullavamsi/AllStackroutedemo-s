package com.stackroute;
import java.util.Scanner;
public class Temprature {

    public static void main(String[] args) {
	// write your code here
        float temp;
        Scanner in=new Scanner(System.in);
        System.out.println("SNO:\tTemprature(inCelusis)\t\tTemprature(in farenheat)");
        for(int i=1;i<100;i++)
        {
            System.out.print(i+"\t\t\t  ");
            temp=in.nextFloat();
            System.out.print("\b\r\r\r\t\t\t\t\t\t\t\t\t\t"+((9/5*temp)+32));
            System.out.println();
        }
    }
}
