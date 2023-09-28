package com.workintech.product;

public class Bread extends ProductForSale{
    private boolean isWheat;

    public Bread(String type, double price, String description, boolean isWheat) {
        super(type, price, description);
        this.isWheat = isWheat;
    }


    public void showDetails(){
        System.out.println("Type: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Bread is Wheat? : " + isWheat);
    }
}
