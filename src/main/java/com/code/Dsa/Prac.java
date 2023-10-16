package com.code.Dsa;

import java.util.Arrays;

public class Prac {
    public static void main(String... runMyCode){
        int[] arraysOfnNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(reverse(arraysOfnNumbers));
    }
    public static int count = 0;
    public static String reverse(int[] number){
        int[] newNumber = new int[number.length];
        for (int i = number.length -1; i >=0 ; i--) {
            newNumber[count] = number[i];
            count++;
        }
        return "The reverse form of the array is " + Arrays.toString(newNumber);
    }
}
