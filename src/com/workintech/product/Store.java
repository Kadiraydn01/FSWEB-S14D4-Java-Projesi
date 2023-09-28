package com.workintech.product;

class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("Sales Price for 4 : $ " + product.getSalesPrice(4));
            System.out.println("********************");
        }

    }
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Chocolate with Milk", 2.5, "Creamy milk chocolate bar", false),
                new Coke("Pepsi with Lemon", 1.0, "Refreshing cola drink", 2.5),
                new Bread(" Wheat Bread", 3.0, "Freshly baked loaf of bread", true)
        };
        listProducts(products);
    }

}