package com.stackroute;
import java.util.Scanner;
public class AddDistance {

    private int feet;
    private float inches;
//collecting user in inputs in feets and inches
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Distance in feets ");
        feet= in.nextInt();
        System.out.print("Enter Distance in inches ");
        inches=in.nextFloat();
    }
//    Calculating Diatance in terms of inches and feets where one feet is equal to 12 inches.
    public void distance(AddDistance D1,AddDistance D2)
    {
        inches =D1.inches+D2.inches;
        feet=D1.feet+D2.feet+(int)(inches/12);
        inches=inches%12;
    }
    //Tis method is used to display distance interms of feets and inches.

    void display()
    {
        System.out.println("Total Distance is "+feet+" feets and "+inches+" inches");
    }

    public static void main(String[] args) {

        AddDistance D1=new AddDistance();
        AddDistance D2=new AddDistance();
        AddDistance D3=new AddDistance();
        System.out.println("Enter The First Distance");
        D1.input();
        System.out.println("Enter The Second Distance");
        D2.input();
        D3.distance(D1,D2);
        System.out.println("Total Distance is "+D3.feet+" feets and "+D3.inches+" inches");
    }

}
