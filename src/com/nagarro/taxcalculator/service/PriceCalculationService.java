package com.nagarro.taxcalculator.service;

import java.util.ArrayList;

import com.nagarro.taxcalculator.item.Item;

public class PriceCalculationService {

    public void gg(ArrayList<Item> itemsInfo) {
        for (Item item : itemsInfo) {
            String type = item.getItemType();
            double itemsPrice = item.getItemPrice();
            int itemsQuantity = item.getItemQuantity();
            ServiceImpl service = null;
            switch (type) {
            case "Raw":
                service = new RawItemServiceImpl();
                break;
            case "Manufactured":
                service = new ManufacturedItemServiceImpl();
                break;
            case "Imported":
                service = new ImportedItemServiceImpl();
                break;
            }
            double taxPrice = service.priceCalculation(itemsPrice, itemsQuantity);
            item.setTaxPrice(taxPrice);
        }
    }

}
