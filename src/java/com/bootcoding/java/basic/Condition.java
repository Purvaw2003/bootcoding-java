
package com.bootcoding.java.basic;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by 3");
        } else {
            System.out.println(n+" is divisible by 5");
        }

    }


}