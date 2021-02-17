/*
* Class name: ItemNameUtility
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
* Description: String utility class is used to check the item name contains alphabet
*/
package com.nagarro.taxcalculator.utility;

public class ItemNameUtility {
    /* Check item name contains all alphabet */
    public boolean isNameContainsOnlyAlphabet(String itemName) {
        return ((itemName != null) && (!itemName.equals("")) && (itemName.matches("^[a-zA-Z]*$"))) ? false : true;
    }
}
