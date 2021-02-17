/*
* Class name: ImportedItemServiceImpl
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
* Description: Calculate the tax price for the imported item type
*/
package com.nagarro.taxcalculator.service.impl;

import com.nagarro.taxcalculator.service.TaxPriceCalculation;

public class ImportedItemTaxPriceCalculationImpl implements TaxPriceCalculation {
    @Override
    public double taxPrice(double itemPrice, int itemQuantity) {
        double importedTax = itemPrice * .01;
        if (importedTax <= 100) {
            importedTax += 5;
        } else if (importedTax >= 100 && importedTax <= 200)
            importedTax += 10;
        else
            importedTax += 5.0 / 100 * (importedTax + itemPrice);
        return importedTax;
    }
}
