package com.code.Dsa;


public class ReverseInt {
    public static int reverse(int x) {
        int reversedInteger = 0;
        while (x != 0) {
            reversedInteger = reversedInteger * 10 + x % 10;
            x /= 10;
        }

        if (reversedInteger > Integer.MAX_VALUE || reversedInteger < Integer.MIN_VALUE) {
            return 0;
        } else {
            return reversedInteger;
        }
    }
}
