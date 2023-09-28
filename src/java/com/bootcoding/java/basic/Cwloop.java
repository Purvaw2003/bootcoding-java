package com.bootcoding.java.basic;

public class Cwloop {
    public static void main(String[] args) {
        double sum = 0;
        for (double x = 1; x <= 5; x++) {

            System.out.println(1 / x);
            sum = sum + 1 / x;
        }
        {
            System.out.println("Sum of Series upto 5 terms=" + sum);


        }


    }


}