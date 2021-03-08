package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String args[])throws IOException {
        GetHouseFactory planFactory = new GetHouseFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String houseName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        House p = planFactory.getHouse(houseName);
        //call getRate() method and calculateBill()method of DomesticPaln.

        System.out.print("Bill amount for "+houseName+" of  "+units+" units is: ");
        p.getPrice();
        p.calculateBill(units);
    }
}
