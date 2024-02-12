package com.bootcoding.java.ifelse;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("enter any year");
        int year = s.nextInt();


        if (year % 4== 0 && year % 100 ==0 && year % 400==0) {
            System.out.println("it is leap year");
        }else {
            System.out.println("it is not a leap year");
        }
    }
}