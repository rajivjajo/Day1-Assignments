package com.bridgelabz.assinments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year\n");
        int year = s.nextInt();

        if (year % 400 == 0)
            System.out.println (year + " is a Leap Year");

        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");

        else
            System.out.println (year + " is not a Leap Year");
    }
}
