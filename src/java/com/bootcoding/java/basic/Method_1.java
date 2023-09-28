package com.bootcoding.java.basic;

public class Method_1 {
    public static void main(String[] args) {
        add(10, 20);
        sub(20, 10);
        mul(20, 10);
        div(20, 10);

    }

    public static void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition=" + c);
    }

    public static void sub(int a, int b) {
        int c = a - b;
        System.out.println("substraction=" + c);
    }

    public static void mul(int a, int b) {
        int c = a * b;
        System.out.println("multiplication=" + c);
    }

    public static void div(int a, int b) {
        int c = a / b;
        System.out.println("division=" + c);
    }
}