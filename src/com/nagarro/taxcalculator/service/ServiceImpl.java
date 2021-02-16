/*
* Class name: ServiceImpl
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
* Description: An interface that is inherited by RawItemServiceImpl, ManufacturedItemServiceImpl, ImportedItemServiceImpl
*/
package com.nagarro.taxcalculator.service;

public interface ServiceImpl {
    /**
     * tax price calculation method
     */
    double taxPriceCalculation(double itemPrice, int itemQuantity);
}
