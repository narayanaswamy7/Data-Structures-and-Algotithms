package com.ns.dsa.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertionSort {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Array Elements: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String [] arr = input.split(" ");

        insertionSort(arr);
        printArray(arr);
    }

    private static void printArray(String [] arr) {
        for (String s : arr) {
            System.out.print(s+" ");
        }
    }

    private static void insertionSort(String[] arr) {
        for (int j=1; j<arr.length; j++) {
            int key = Integer.parseInt(arr[j]);
            int i = j-1;
            while (i>=0 && Integer.parseInt(arr[i])>key) {
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = String.valueOf(key);
        }

    }
}
