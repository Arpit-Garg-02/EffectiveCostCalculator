package com.nagarro.taxcalculator.exception;

public class InvalidItemException extends RuntimeException {
    public InvalidItemException(String message) {
        System.out.println("Exception : " + message);
        
    }
}
