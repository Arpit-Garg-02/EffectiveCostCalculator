package com.nagarro.taxcalculator.service;

public class RawItemServiceImpl implements ServiceImpl {
    @Override
    public double priceCalculation(double itemPrice, int itemQuantity) {
        return itemPrice * .125;
    }
}
