package com.workintech.product;

public class Coke extends ProductForSale{
    private double liter;

    public Coke(String type, double price, String description, double liter) {
        super(type, price, description);
        this.liter = liter;
    }


    public void showDetails(){
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Liter: " + liter);
    }
}
