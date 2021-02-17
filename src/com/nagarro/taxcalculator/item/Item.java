/*
* Class name: Item
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 16/Feb/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 16/Feb/2021
*
* Description: Details of an item
*/
package com.nagarro.taxcalculator.item;

/* Item class is used to save the information on an item */
public class Item {
    private String name;
    private String itemType;
    private double price;
    private int quantity;
    private double taxPrice;

    Item(String[] itemsInfo) {
        this.name = itemsInfo[0];
        this.price = Double.parseDouble(itemsInfo[1]);
        this.quantity = Integer.parseInt(itemsInfo[2]);
        this.itemType = itemsInfo[3];
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
