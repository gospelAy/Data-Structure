package com.code;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args){
        Queue<person> supermarket = new LinkedList<>();
        supermarket.add(new person("Alex", 21));
        supermarket.add(new person("Mariam", 18));
        supermarket.add(new person("Ali", 40));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static record person(String name, int age){
    }
}
