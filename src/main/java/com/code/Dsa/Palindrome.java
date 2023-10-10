package com.code.Dsa;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number or String: ");
        String input = scanner.nextLine();
        StringBuilder reverse = new StringBuilder();
        for (int i = input.length() -1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }
        if (reverse.toString().equals(input)){
            System.out.println("This is a palindrome");

        } else System.out.println("not a palindrome");
    }
}
