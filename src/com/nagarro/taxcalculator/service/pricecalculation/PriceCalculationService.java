/*
* Class name: PriceCalculationService 
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
* Description: Calculate the tax price according to the item type
*/
package com.nagarro.taxcalculator.service.pricecalculation;

import java.util.ArrayList;

import com.nagarro.taxcalculator.item.Item;
import com.nagarro.taxcalculator.service.TaxPriceCalculation;
import com.nagarro.taxcalculator.service.impl.ImportedItemTaxPriceCalculationImpl;
import com.nagarro.taxcalculator.service.impl.ManufacturedItemTaxPriceCalculationImpl;
import com.nagarro.taxcalculator.service.impl.RawItemTaxPriceCalculationImpl;

public class PriceCalculationService {
    /* Calculate the tax price according to the item type */
    public void taxCalculation(ArrayList<Item> itemsInfo) {
        for (Item item : itemsInfo) {
            String type = item.getItemType();
            double itemsPrice = item.getItemPrice();
            int itemsQuantity = item.getItemQuantity();
            TaxPriceCalculation service = null;
            switch (type) {
            case "Raw":
                service = new RawItemTaxPriceCalculationImpl();
                break;
            case "Manufactured":
                service = new ManufacturedItemTaxPriceCalculationImpl();
                break;
            case "Imported":
                service = new ImportedItemTaxPriceCalculationImpl();
                break;
            }
            double taxPrice = service.taxPrice(itemsPrice, itemsQuantity);
            item.setTaxPrice(taxPrice);
        }
    }
}
