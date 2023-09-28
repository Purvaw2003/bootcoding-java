
package com.bootcoding.java.basic;
import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        Evenodd();//method calling
    }     //method defination

    public static void Evenodd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        if (n / 2 == 0) {
            System.out.println("even number=");
        } else {
            System.out.println("odd number=");
        }


    }


}