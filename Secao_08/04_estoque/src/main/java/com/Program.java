package com;

import entities.Product;

public class Program {

    public static void main(String[] args) {
        Product product = new Product();
        product.name = "TV";
        product.price = 900;
        product.quantity = 10;
        System.out.println(product);
        System.out.println("Adicionando 5 itens ao estoque");
        product.addProducts(5);
        System.out.println(product);
        System.out.println("Removendo 3 itens do estoque");
        product.removeProducts(3);
        System.out.println(product);
    }
}
