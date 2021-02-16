package com.nagarro.taxcalculator.item;

public class Item {
    private String name;
    private String itemType;
    private double price;
    private int quantity;
    private double taxPrice;

    Item(String[] itemInfo) {
        this.name = itemInfo[0];
        this.price = Double.parseDouble(itemInfo[1]);
        this.quantity = Integer.parseInt(itemInfo[2]);
        this.itemType = itemInfo[3];
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public String getItemName() {
        return this.name;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setItemPrice(double price) {
        this.price = price;
    }

    public double getItemPrice() {
        return this.price;
    }

    public void setItemQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemQuantity() {
        return this.quantity;
    }

    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }

    public double getTaxPrice() {
        return this.taxPrice;
    }

    public double getTotalTax() {
        return getTaxPrice() + getItemPrice();
    }
}
