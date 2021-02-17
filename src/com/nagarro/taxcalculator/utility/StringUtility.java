package com.nagarro.taxcalculator.utility;

public class StringUtility {
    public boolean isNameContainsOnlyAlphabet(String str) {
        if((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$"))) {
            return false;
        }
        return true;
    }
}
