/*
* Class name: ItemManager
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
* Description: Used to take user inputs and handles all the excpetion 
*/
package com.nagarro.taxcalculator.model;

import java.util.ArrayList;
import java.util.Scanner;

import com.nagarro.taxcalculator.exception.InvalidItemException;
import com.nagarro.taxcalculator.service.ItemTaxPriceCalculation;
import com.nagarro.taxcalculator.validate.ItemValidation;

public class ItemManager {
    private static final String RE_ENTER_TYPE_OF_ITEM_RAW_MANUFACTURED_IMPORTED = "Re-Enter type of item [ Raw , Manufactured , Imported ] : ";
    private static final String ENTER_TYPE_OF_ITEM_RAW_MANUFACTURED_IMPORTED = "Enter type of item [ Raw , Manufactured , Imported ] : ";
    private static final String RE_ENTER_QUANTITY_OF_ITEM = "Re-Enter quantity of item : ";
    private static final String ENTER_QUANTITY_OF_ITEM = "Enter quantity of item : ";
    private static final String RE_ENTER_PRICE_OF_ITEM = "Re-Enter price of item : ";
    private static final String ENTER_PRICE_OF_ITEM = "Enter price of item : ";
    private static final String RE_ENTER_NAME_OF_ITEM = "re-Enter name of item : ";
    private static final String DO_YOU_WANT_TO_ENTER_DETAILS_OF_ANY_OTHER_ITEM_Y_N = "Do you want to enter details of any other item (y/n):";
    private static final String ENTER_NAME_OF_ITEM = "Enter name of item : ";
    private Scanner scan = new Scanner(System.in);

    /**
     * Used for user input and validate the all input
     * 
     * @throws InvalidItemException
     */
    public void startManager() throws InvalidItemException {
        ArrayList<Item> itemsInfo = new ArrayList<>();
        char ch;
        do {
            Item item = new Item();
            enterItemName(item); // enter item name
            enterItemPrice(item); // enter item price
            enterItemQuantity(item); // enter item quantity
            enterItemType(item); // enter item type
            itemsInfo.add(item);
            System.out.println(DO_YOU_WANT_TO_ENTER_DETAILS_OF_ANY_OTHER_ITEM_Y_N);
            ch = scan.next().charAt(0);
            scan.close();
        } while (ch == 'y');
        new ItemTaxPriceCalculation().taxCalculation(itemsInfo);

        displayItems(itemsInfo);

    }

    /**
     * Display the information of the item
     * 
     * @param itemType
     * @return print the item information
     */
    private void displayItems(ArrayList<Item> itemInfo) {
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %15s %15s %15s %15s", "Name", "Price", "Quantity", "Type", "Sales Tax",
                "Final Price");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------");
        for (Item item : itemInfo) {
            System.out.printf("%10s %10s %15s %15s %15s %15s", item.getItemName(), item.getItemPrice(),
                    item.getItemQuantity(), item.getItemType(), item.getTaxPrice(), item.getTotalTax());
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    /**
     * Used for input item item
     * 
     * @param item
     */
    private void enterItemName(Item item) {
        System.out.println(ENTER_NAME_OF_ITEM);
        boolean flag = true;
        while (flag) {
            String name = scan.nextLine();
            try {
                new ItemValidation().isValidStringInput(name);
                flag = false;
                item.setItemName(name);
            } catch (InvalidItemException e) {
                System.out.println(RE_ENTER_NAME_OF_ITEM);
                flag = true;
            }
        }
    }

    /**
     * Used for input item price
     * 
     * @param item
     */
    private void enterItemPrice(Item item) {
        System.out.println(ENTER_PRICE_OF_ITEM);
        boolean flag = true;
        while (flag) {
            String price = scan.nextLine();
            try {
                new ItemValidation().priceValidate(price);
                flag = false;
                item.setItemPrice(Double.parseDouble(price));
            } catch (InvalidItemException e) {
                System.out.println(RE_ENTER_PRICE_OF_ITEM);
                flag = true;
            }
        }
    }

    /**
     * Used for input item quantity
     * 
     * @param item
     */
    private void enterItemQuantity(Item item) {
        boolean flag = true;
        System.out.println(ENTER_QUANTITY_OF_ITEM);
        while (flag) {
            String quantity = scan.nextLine();
            try {
                new ItemValidation().quantityValidate(quantity);
                flag = false;
                item.setItemQuantity(Integer.parseInt(quantity));
            } catch (InvalidItemException e) {
                System.out.println(RE_ENTER_QUANTITY_OF_ITEM);
                flag = true;
            }
        }
    }

    /**
     * Used for input item type
     * 
     * @param item
     */
    private void enterItemType(Item item) {
        System.out.println(ENTER_TYPE_OF_ITEM_RAW_MANUFACTURED_IMPORTED);
        boolean flag = true;
        while (flag) {
            String type = scan.nextLine();
            try {
                new ItemValidation().validateTypeOption(type);
                flag = false;
                item.setItemType(type);
            } catch (InvalidItemException e) {
                System.out.println(RE_ENTER_TYPE_OF_ITEM_RAW_MANUFACTURED_IMPORTED);
                flag = true;
            }
        }
    }
}
