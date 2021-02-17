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
package com.nagarro.taxcalculator.model;

/* Item class is used to save the information on an item */
public class Item {
    private String name;
    private String itemType;
    private double price;
    private int quantity;
    private double taxPrice;

    /**
     * Set the name of the item
     * 
     * @param name
     */
    public void setItemName(String name) {
        this.name = name;
    }

    /**
     * @return item name
     */
    public String getItemName() {
        return this.name;
    }

    /**
     * set the type of the item
     * 
     * @param name
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * @return item type
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * set the price of item
     * 
     * @param price
     */
    public void setItemPrice(double price) {
        this.price = price;
    }

    /**
     * @return price
     */
    public double getItemPrice() {
        return this.price;
    }

    /**
     * set quantity of item
     * 
     * @param quantity
     */
    public void setItemQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return quantity
     */
    public int getItemQuantity() {
        return this.quantity;
    }

    /**
     * Set tax price of item
     * 
     * @param taxPrice
     */
    public void setTaxPrice(double taxPrice) {
        this.taxPrice = taxPrice;
    }

    /**
     * @return taxPrice
     */
    public double getTaxPrice() {
        return this.taxPrice;
    }

    /**
     * @return
     */
    public double getTotalTax() {
        return getTaxPrice() + getItemPrice();
    }
}
