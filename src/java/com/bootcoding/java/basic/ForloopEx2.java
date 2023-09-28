
package com.bootcoding.java.basic;
import java.util.Scanner;

public class ForloopEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int x = 1; x <= n; x++) {
            sum = sum + x;
        }
        System.out.println(sum);

    }


}