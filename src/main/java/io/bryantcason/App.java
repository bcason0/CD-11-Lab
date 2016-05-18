package io.bryantcason;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String personName = name.next();

        if(personName.equals("Alice") || personName.equals("Bob")){
            System.out.println("Hello " + personName);
        }
        else {
            System.out.println("Nice to meet you " + personName + " .But I don't know you!");
        }
    }
}
