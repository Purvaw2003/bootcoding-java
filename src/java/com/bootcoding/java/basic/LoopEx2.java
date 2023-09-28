package com.bootcoding.java.basic;

public class LoopEx2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 100; x <= 200; x++) {
            if (x % 9 == 0) {
                System.out.print(x + " ");
                sum = sum + x;

            }
        }

        System.out.println("Sum=" + sum);


    }


}