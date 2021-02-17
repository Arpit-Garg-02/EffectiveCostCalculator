package com.nagarro.taxcalculator.utility;

public class StringUtility {
    public boolean isStringOnlyAlphabet(String str) {
        if((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$"))) {
            return false;
        }
        return true;
    }
}
