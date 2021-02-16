package com.nagarro.taxcalculator.service;

public class ImportedItemServiceImpl implements ServiceImpl {
    @Override
    public double priceCalculation(double itemPrice, int itemQuantity) {
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
