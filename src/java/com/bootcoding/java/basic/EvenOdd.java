
package com.bootcoding.java.basic;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even no.");
        } else {
            System.out.println(n + " is odd no.");
        }


    }


}
