package com.javacourse.sequential_structure.basic_example;

public class ProductInfoOutput {
    public static void main(String[] args) {
        String productName = "Laptop";
        int quantity = 5;
        double pricePerUnit = 799.99;

        double totalPrice = quantity * pricePerUnit;

        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: $" + pricePerUnit);
        System.out.println("Total price: $" + totalPrice);
    }
}

