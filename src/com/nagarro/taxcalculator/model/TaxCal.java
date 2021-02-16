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
* Description: Model class of the project
*/
package com.nagarro.taxcalculator.model;

import com.nagarro.taxcalculator.item.ItemManager;

public class TaxCal {
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();
        manager.startManager();
    }
}
