package com.code.Dsa;
import java.util.Arrays;

public class Reverse {
    public static void main(String...args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reverseArray = new int[numbers.length];
        for (int i = numbers.length -1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = numbers[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}