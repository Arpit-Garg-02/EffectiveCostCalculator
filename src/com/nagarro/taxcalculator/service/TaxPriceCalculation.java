/*
* Class name: TaxPriceCalculation
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
* Last updated Date: 17/Feb/2021
*
* Description: TaxPriceCalculation is inherited by RawItemServiceImpl, ManufacturedItemServiceImpl, 
* ImportedItemServiceImpl to calculate tax price
*/
package com.nagarro.taxcalculator.service;

public interface TaxPriceCalculation {
    /* Calculate the tax price of an item */
    double taxPrice(double itemPrice, int itemQuantity);
}
