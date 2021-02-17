/*
* Class name: TaxCal
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
* Description: Model class of the TaxCalculator
*/
package com.nagarro.taxcalculator.main;

import com.nagarro.taxcalculator.model.ItemManager;

public class TaxCalculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        new ItemManager().startManager();
    }
}
