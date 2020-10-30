package com.stackroute;

public class Student {
    String roll_no;
    String phone_number;
    String address;
    String name;

    public static void main(String[] args) {
	// write your code here
        Student ref=new Student();
        ref.name="Johon";
        ref.phone_number="9394933993";
        ref.address="Anantapur";
        System.out.println("name "+ref.name+ " address" +ref.address+"Phone number is "+ref.phone_number);
        ref.name="harprya";
        ref.phone_number="91345678976";
        ref.address="Gooty";
        System.out.println("name"+ref.name+ "address " +ref.address+" Phone number" +ref.phone_number);

    }
}
