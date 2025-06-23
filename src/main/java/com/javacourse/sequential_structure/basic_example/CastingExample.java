package com.javacourse.sequential_structure.basic_example;

public class CastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;  // explicit casting

        System.out.println("Double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);

        int intNumber = 100;
        double doubleNumber = intNumber;  // implicit casting

        System.out.println("Int value: " + intNumber);
        System.out.println("After casting to double: " + doubleNumber);
    }
}
