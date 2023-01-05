package com.bridgelabz.assinments;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        String A, B;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String\n");
        A = scanner.next();
        System.out.println("Enter second String\n");
        B = scanner.next();


        if (A.equals(B))
        {
            System.out.print("Equal Strings");
        } else
        {
            System.out.print("UnEqual Strings");


        }
    }

}