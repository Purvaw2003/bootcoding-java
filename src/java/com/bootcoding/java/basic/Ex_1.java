package com.bootcoding.java.basic;

public class Ex_1 {
    public static void main(String[] args) {
        int i = 10;
        int count = 0;
        while (i != 0) {

            if (i % 2 == 0) {
                i = i / 2;
                System.out.println(i);
            } else {
                i = i - 1;
                System.out.println(i);
            }


            count++;
        }


    }


}
 
 
 
 
 
 
 