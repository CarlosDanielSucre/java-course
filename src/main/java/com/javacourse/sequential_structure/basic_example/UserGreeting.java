package com.javacourse.sequential_structure.basic_example;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome!");
        scanner.close();
    }
}
