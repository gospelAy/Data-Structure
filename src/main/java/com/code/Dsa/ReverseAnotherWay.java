package com.code.Dsa;

import java.util.Arrays;

public class ReverseAnotherWay {
    public static void main(String[] args) {
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        reverse(arrayNumber);
    }
    static int counter = 0;
    public static void reverse(int[] number){
        int[] newArrays = new int[number.length];
        for (int i = number.length -1; i >= 0; i--) {
            newArrays[counter] = number[i];
            counter++;
        }
        System.out.print(Arrays.toString(newArrays));
    }
}
