package com.bl;

public class PrintArray {

    public static void printArray(char[] chars) {
        for (char c : chars) {
            System.out.println( c );
        }
    }
    public static void printArray(int[] intArray) {
        for (int c : intArray) {
            System.out.println( c );
        }
    }

    public static void printArray(double[] doubles) {
        for (double c : doubles) {
            System.out.println( c );
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        double[] doubles = {1.1, 2.1, 3.0};
        char[] chars = {'a', 'b'};
        printArray( chars );
        printArray( intArray );
        printArray( doubles );
    }
}