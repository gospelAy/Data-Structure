package com.code.Dsa;

public class LCMCalculator {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static int calculateLCM(int num1, int num2) {
        int max = Math.max(num1, num2);
        int lcm = max;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
            lcm += max;
        }

        return lcm;
    }
}
