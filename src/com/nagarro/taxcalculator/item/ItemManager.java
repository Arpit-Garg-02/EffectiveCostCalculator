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
package com.nagarro.taxcalculator.item;

import java.util.ArrayList;
import java.util.Scanner;

import com.nagarro.taxcalculator.exception.InvalidItemException;
import com.nagarro.taxcalculator.service.pricecalculation.PriceCalculationService;
import com.nagarro.taxcalculator.validate.ItemValidation;

public class ItemManager {
    private ArrayList<Item> itemsInfo = new ArrayList<>();

    /* Used for user input and validate the all input */
    public void startManager() throws InvalidItemException {
        char ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name of item : ");
            String name = scan.nextLine();
            ItemValidation validate = new ItemValidation();
            try {
                validate.compulsoryArgument(name);
            } catch (Exception e) {
                System.out.println("re-Enter name of item : ");
                name = scan.nextLine();
            }
            System.out.println("Enter price of item : ");
            String price = scan.nextLine();
            try {
                validate.priceValidate(price);
            } catch (Exception e) {
                System.out.println("Re-Enter price of item : ");
                price = scan.nextLine();
            }
            System.out.println("Enter quantity of item : ");
            String quantity = scan.nextLine();
            try {
                validate.quantityValidate(quantity);
            } catch (Exception e) {
                System.out.println("Re-Enter quantity of item : ");
                quantity = scan.nextLine();
            }
            System.out.println("Enter type of item [ Raw , Manufactured , Imported ] : ");
            String type = scan.nextLine();
            try {
                validate.validateTypeOption(type);
            } catch (Exception e) {
                System.out.println("Re-Enter type of item [ Raw , Manufactured , Imported ] : ");
                type = scan.nextLine();
            }
            String itemInfo[] = new String[] { name, price, quantity, type };
            Item item = new Item(itemInfo);
            itemsInfo.add(item);
            System.out.println("Do you want to enter details of any other item (y/n):");
            ch = scan.next().charAt(0);
        } while (ch == 'y');
        PriceCalculationService priceCal = new PriceCalculationService();
        priceCal.taxCalculation(itemsInfo);
        displayItems(itemsInfo);
    }

    /* Display the details of the item */
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
}
