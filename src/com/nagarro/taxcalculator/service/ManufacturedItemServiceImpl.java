package com.nagarro.taxcalculator.service;

public class ManufacturedItemServiceImpl implements ServiceImpl {
    @Override
    public double priceCalculation(double itemPrice, int itemQuantity) {
        double manufacturedTax = itemPrice * .125;
        manufacturedTax += (itemPrice + manufacturedTax) * .02;
        return manufacturedTax;
    }
}
