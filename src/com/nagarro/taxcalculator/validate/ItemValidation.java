/*
* Class name: ItemValidation
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
* Description: validate the item information and generate the exception accordingly
*/
package com.nagarro.taxcalculator.validate;

import com.nagarro.taxcalculator.exception.InvalidItemException;
import com.nagarro.taxcalculator.utils.StringValidationUtil;

public class ItemValidation {
    /**
     * Check item name is valid or not empty
     * 
     * @param itemInfo
     * @return true, if name is not empty
     */
    public void isValidStringInput(String itemInfo) {
        if (itemInfo.isEmpty()) {
            throw new InvalidItemException("name option must be the first option!");
        }
        // Check item name all character are alphabets or not
        if (new StringValidationUtil().isNameContainsOnlyAlphabet(itemInfo)) {
            throw new InvalidItemException("Name must contains alphabets!");
        }
    }

    /**
     * Check item quantity is a number
     * 
     * @param quantity
     * @return true, if quantity is an number
     */
    public void quantityValidate(String quantity) {
        try {
            Integer.parseInt(quantity);
        } catch (Exception e) {
            throw new InvalidItemException("Invalid input ! Item quantity is integer.");
        }
    }

    /**
     * Check item price is a number
     * 
     * @param price
     * @return true, if price is an number
     */
    public void priceValidate(String price) {
        try {
            Double.parseDouble(price);
        } catch (Exception e) {
            throw new InvalidItemException("Invalid input ! Item Price is a number.");
        }
    }

    /**
     * Check item type is Raw, Manufactured, Imported
     * 
     * @param itemType
     * @return InvalidItemException if item type mismatch
     */
    public void validateTypeOption(String itemType) {
        if (itemType.isEmpty()) {
            throw new InvalidItemException("Type must be a value!");
        }
        switch (itemType) {
        case "Raw":
        case "Manufactured":
        case "Imported":
            break;
        default:
            throw new InvalidItemException("Invalid 'Item Type' specified !");
        }
    }
}
