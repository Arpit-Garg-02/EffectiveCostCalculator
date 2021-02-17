/*
* Class name: RawItemServiceImpl
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
package com.nagarro.taxcalculator.service.impl;

import com.nagarro.taxcalculator.service.TaxPriceCalculation;

public class RawItemTaxPriceCalculationImpl implements TaxPriceCalculation {
    @Override
    public double taxPrice(double itemPrice, int itemQuantity) {
        return itemPrice * .125;
    }
}
