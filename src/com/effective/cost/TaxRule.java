/*
* Class name: TaxRule
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
* Description: The main class of the Effective Cost, Purpose to calculate effective cost for
* Raw, Manufactured, Imported items
*/
package com.effective.cost;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaxRule {
    public TaxRule() {
        char ch;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name of item : ");
            String name = scan.nextLine();
            System.out.println("Enter price of item : ");
            String price = scan.nextLine();
            System.out.println("Enter quantity of item : ");
            String quantity = scan.nextLine();
            System.out.println("Enter type of item [ Raw , Manufactured , Imported ] : ");
            String type = scan.nextLine();
            String itemInfo[] = new String[] { name, price, quantity, type };
            ArrayList<String> items_info = new ArrayList<>(Arrays.asList(itemInfo));
            double sales_tax = new ItemValidation().itemDeatil(items_info);
            System.out.println("Items Details....");
            System.out.println("Name of item : " + name);
            System.out.println("Price of item : " + price);
            System.out.println("Sales tax liability per item : " + sales_tax);
            double calculatedPrice = Double.parseDouble(price) + sales_tax;
            System.out.println("final price : " + calculatedPrice);
            System.out.println("Do you want to enter details of any other item (y/n):");
            ch = scan.next().charAt(0);
        } while (ch == 'y');
        System.out.println("Exit...\nThank You!...");
    }

    public static void main(String[] args) {
        new TaxRule();
    }

}