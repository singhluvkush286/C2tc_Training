package com.tns.defaultConstructor;

import java.util.Scanner;

public class DefaultConstructor {
    public static void main(String[] args) {
        String name;
        String address;
        int phone;
        long salesAmount;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name:");
        name = in.nextLine();
        System.out.println("Enter the Address:");
        address = in.nextLine();
        System.out.println("Enter the Phone Number:");
        phone = in.nextInt();
        System.out.println("Enter the Sales Amount:");
        salesAmount = in.nextLong();
        
        Commission com = new Commission(name, address, phone, salesAmount);
        Cal c = new Cal();
        int commission = c.sales(com);
        System.out.println("After calculation the Commission is ");
        System.out.println(commission);
        
        in.close(); // Don't forget to close the Scanner when you're done with it.
    }
}

