/*
* Class name: ImportedItemTaxPriceCalculationImpl
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
package com.nagarro.taxcalculator.service.pricecalculation.impl;

import com.nagarro.taxcalculator.service.pricecalculation.TaxPriceCalculation;

public class ImportedItemTaxPriceCalculationImpl implements TaxPriceCalculation {
    /**
     * Calculate the tax price of Imported item type
     * 
     * @param itemPrice
     * @param itemQuantity
     * @return return tax price of Imported item
     */
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
