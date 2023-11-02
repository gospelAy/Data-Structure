package com.code.Dsa;



public class HCF {
    public static int hcf(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}