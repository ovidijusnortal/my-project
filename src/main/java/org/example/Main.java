package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(buildGreeting("World"));
    }

    public static String buildGreeting(String name) {
        return "Hello " + name + "!";
    }
}