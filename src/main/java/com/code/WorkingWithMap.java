package com.code;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {

    }
    private static void map(){

        Map<Integer, person> map = new HashMap<>();
        map.put(1, new person("Alex"));
        map.put(2, new person("Alexa"));
        map.put(3, new person("Mariam 2"));
//        The key must be uniq or else it will be overriding things
//        The latest insert will override the  key you have initially provide for mariam
        map.put(3, new person("Mariam"));
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.entrySet().forEach(System.out::println);
        map.remove(3);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        map.forEach((key, person) -> {
            System.out.println(key + "-" + person);
        });
        System.out.println(map.getOrDefault(3, new person("default")));
        System.out.println(map.values());
    }
    record person(String name){

    }
}
