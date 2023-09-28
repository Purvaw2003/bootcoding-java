
package com.bootcoding.java.basic;
import java.util.Scanner;

public class ReturnExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int S = getSum(num);
        System.out.println("Sum of " + num + " is " + S);
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;


        }
        return sum;


    }


}