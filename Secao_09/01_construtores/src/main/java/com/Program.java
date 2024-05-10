package com;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        String name = "TV";
        double price = 900.00;
        int quantity = 10;
        Product product = new Product(name, price, quantity);
        System.out.println(product);
        System.out.println("Adicionando 5 itens ao estoque");
        product.addProducts(5);
        System.out.println(product);
        System.out.println("Removendo 3 itens do estoque");
        product.removeProducts(3);
        System.out.println(product);
    }
}
