/*
* Class name: InvalidItemException
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 11/Feb/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 12/Feb/2021
*
* Description: give description of the Exceptions and provide user to re-enter the item information
*/
package com.nagarro.taxcalculator.exception;

public class InvalidItemException extends RuntimeException {
    /**
     * This method is used to give the error message if any exception occurs
     * 
     * @param exceptionMessage
     */
    public InvalidItemException(String exceptionMessage) {
        System.out.println("Exception :" + exceptionMessage);
    }
}
