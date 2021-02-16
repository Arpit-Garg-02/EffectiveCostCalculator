package com.nagarro.taxcalculator.validate;

import java.util.ArrayList;

import com.nagarro.taxcalculator.exception.InvalidItemException;

public class ItemValidation {
    public void compulsoryArgument(String itemInfo) {
        boolean flag = false;
        if (itemInfo.isEmpty()) {
            flag = true;
            throw new InvalidItemException("name option must be the first option !");
        }
    }

    public void quantityValidate(String quantity) {
        try {
            Integer.parseInt(quantity);
        } catch (Exception e) {
            throw new InvalidItemException("Invalid input ! Item quantity is integer.");
        }
    }

    public void priceValidate(String price) {
        boolean flag = false;
        try {
            Double.parseDouble(price);
        } catch (Exception e) {
            flag = true;
            throw new InvalidItemException("Invalid input ! Item Price is a number.");
        }
    }

    public void validateTypeOption(String itemType) {
        if (itemType == "") {
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
