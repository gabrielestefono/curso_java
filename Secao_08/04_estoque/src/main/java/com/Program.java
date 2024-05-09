package com;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        Product product = new Product();
        product.name = "TV";
        product.price = 700;
        product.quantity = 50;
        System.out.println(product.toString());
    }
}
