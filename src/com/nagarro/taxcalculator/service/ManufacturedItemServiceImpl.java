/*
* Class name: ManufacturedItemServiceImpl
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
* Description: Calculate the tax price for the manufactured item type
*/
package com.nagarro.taxcalculator.service;

public class ManufacturedItemServiceImpl implements ServiceImpl {
    @Override
    public double taxPriceCalculation(double itemPrice, int itemQuantity) {
        double manufacturedTax = itemPrice * .125;
        manufacturedTax += (itemPrice + manufacturedTax) * .02;
        return manufacturedTax;
    }
}
