package com.bootcoding.java.basic;

public class WhileloopEx1 {
    public static void main(String[] args) {
        int n = 14468;
        int r = 0;
        int org = n;
        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("org no.=" + org);
        System.out.println("result=" + r);


    }


}
 
 
 
