package com.stackroute;
import java.util.Scanner;
public class TimeTakenToTakeJourney {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        float distance,speed;
        System.out.println("please enter the distance in kilometers and speed in kilometers/minutes");
        distance=in.nextFloat();
        speed=in.nextFloat();
        System.out.println("Time taken for the journey is:"+(distance/speed) +"minutes");
    }
}
