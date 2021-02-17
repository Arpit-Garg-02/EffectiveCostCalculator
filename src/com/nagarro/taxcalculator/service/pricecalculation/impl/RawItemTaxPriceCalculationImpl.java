/*
* Class name: RawItemTaxPriceCalculationImpl
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
* Description: Calculate the tax price for the raw item type
*/
package com.nagarro.taxcalculator.service.pricecalculation.impl;

import com.nagarro.taxcalculator.service.pricecalculation.TaxPriceCalculation;

public class RawItemTaxPriceCalculationImpl implements TaxPriceCalculation {
    /**
     * Calculate the tax price of Raw item type
     * 
     * @param itemPrice
     * @param itemQuantity
     * @return return tax price of raw item
     */
    @Override
    public double taxPrice(double itemPrice, int itemQuantity) {
        return itemPrice * .125;
    }
}
