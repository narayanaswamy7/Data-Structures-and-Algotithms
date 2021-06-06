package com.ns.DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            //System.out.print(getFibonacci(i) + ", ");
        }
        getFibonacci1(10);
    }

    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    public static void getFibonacci1(int n) {
        int first = 0, second = 1;
        int counter = 1;
        while (counter < n) {
            System.out.println(first);
            int next = first+second;
            first = second;
            second = next;
            counter++;
        }
    }
}
