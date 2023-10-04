package com.code;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args){
        LinkedList<person> linkedList = new LinkedList<>();
        linkedList.add(new person("Alex", 21));
        linkedList.add(new person("Alexa", 21));
        linkedList.add(new person("Ali", 18));
        ListIterator<person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
    static record person(String name, int age){
    }
}
