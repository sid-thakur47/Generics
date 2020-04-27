package com.bl;

public class PrintArray<E> {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        Double[] doubleArray = {1.1, 2.1, 3.0};
        Character[] charArray = {'a', 'b', 'c'};
        new PrintArray<Integer>().printArray( intArray );
        new PrintArray<Double>().printArray( doubleArray );
        new PrintArray<Character>().printArray( charArray );
    }
    public void printArray(E[] array) {
        for (E result : array) {
            System.out.println( result );
        }
    }
}