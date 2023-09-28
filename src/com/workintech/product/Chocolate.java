package com.workintech.product;

public class Chocolate extends ProductForSale{
    private boolean isBitter;

    public Chocolate(String type, double price, String description, boolean isBitter) {
        super(type, price, description);
        this.isBitter = isBitter;
    }
public void showDetails(){
    System.out.println("Type: " + getType());
    System.out.println("Price: $" + getPrice());
    System.out.println("Description: " + getDescription());
    System.out.println("Chocolate is Bitter ? :" + isBitter);
}

}
