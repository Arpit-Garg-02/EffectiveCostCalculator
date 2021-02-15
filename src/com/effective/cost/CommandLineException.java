/*
* Class name: CommandLineException
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
* Description: Handle the Exceptions and provide user to re-enter the item information
*/
package com.effective.cost;

public class CommandLineException extends RuntimeException {
    /**
     * This method is used to give the error message if any exception occurs
     */
    public CommandLineException(String message) {
        System.out.println("Exception : " + message);
        System.out.println("Let's Do it again...");
        new TaxRule();
        System.exit(0);
    }
}
