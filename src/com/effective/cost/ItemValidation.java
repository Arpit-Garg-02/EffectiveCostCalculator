/*
* Class name: ItemValidation
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 11/Feb/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 12/Feb/2021
*
* Description: Validate the items info item name, price, quantity 
* and item type as per the requirements
*/
package com.effective.cost;

import java.util.ArrayList;

public class ItemValidation {

    /**
     * This method is check the number of input arguments, if the number of
     * arguments is less than 4 then exception in thrown
     */
    private void numberOfArguments(ArrayList<String> itemsInfo) {
        if (itemsInfo.size() < 4) {
            throw new CommandLineException("At least 4 Arguments needed");
        }
    }

    /**
     * This method is used to check item name and type is empty or not if empty then
     * exception is thrown
     */
    private void compulsoryArguments(ArrayList<String> itemsInfo) {
        if (itemsInfo.get(0) == "") {
            throw new CommandLineException("name option must be the first option !");
        }
        if (itemsInfo.get(3) == "") {
            throw new CommandLineException("type is compulsory !");
        }
    }

    /**
     * This method check the item type, check weather it is Raw, Manufactured,
     * Imported if the type is mismatch with these three type then exception is
     * throw
     */
    private void validateTypeOption(ArrayList<String> itemsInfo) {
        String type = itemsInfo.get(3);
        switch (type) {
        case "Raw":
        case "Manufactured":
        case "Imported":
            break;
        default:
            throw new CommandLineException("Invalid 'Item Type' specified !");
        }
    }

    /**
     * This method is used to check the item price and item quantity is in correct
     * format or not
     */
    private void correctData(ArrayList<String> itemsInfo) {
        try {
            Double.parseDouble(itemsInfo.get(1));
            Integer.parseInt(itemsInfo.get(2));
        } catch (Exception e) {
            throw new CommandLineException("Invalid input ! Item quantity is integer and price is a number.");
        }
    }

    /**
     * validate the number of arguments, compulsory arguments, validate item type
     * and correct data
     */
    private void validate(ArrayList<String> itemsInfo) throws CommandLineException {
        numberOfArguments(itemsInfo);
        compulsoryArguments(itemsInfo);
        correctData(itemsInfo);
        validateTypeOption(itemsInfo);
    }

    /**
     * Calculate the Tax for the Raw item type
     */
    private double rawTax(double itemPrice, int itemQuantity) {
        return itemPrice * .125;
    }

    /**
     * Calculate the Tax for the Manufactured item type
     */
    private double manufacturedTax(double itemPrice, int itemQuantity) {
        double manufacturedTax = itemPrice * .125;
        manufacturedTax += (itemPrice + manufacturedTax) * .02;
        return manufacturedTax;
    }

    /**
     * Calculate the Tax for the Imported item type
     */
    private double importedTax(double itemPrice, int itemQuantity) {
        double importedTax = itemPrice * .01;
        if (importedTax <= 100) {
            importedTax += 5;
        } else if (importedTax >= 100 && importedTax <= 200)
            importedTax += 10;
        else
            importedTax += 5.0 / 100 * (importedTax + itemPrice);
        return importedTax;
    }

    /**
     * This method is used to validate all the input arguments and calculate the
     * effective cost for the entered item type
     */
    public double itemDeatil(ArrayList<String> itemsInfo) throws CommandLineException {
        validate(itemsInfo);
        String type = itemsInfo.get(3);
        double itemsPrice = Double.parseDouble(itemsInfo.get(1));
        int itemsQuantity = Integer.parseInt(itemsInfo.get(2));
        switch (type) {
        case "Raw":
            return rawTax(itemsPrice, itemsQuantity);
        case "Manufactured":
            return manufacturedTax(itemsPrice, itemsQuantity);
        case "Imported":
            return importedTax(itemsPrice, itemsQuantity);
        default:
            throw new CommandLineException("Invalid 'Item Type' specified !");
        }
    }
}
