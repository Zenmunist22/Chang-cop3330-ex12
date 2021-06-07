package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        double principal, interest, years, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        interest = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        years = sc.nextInt();
        total =  (100 * (principal * (1 + ((interest/100)*(years))))) + .5;
        total = (int) total;
        total /= 100;
        System.out.printf("After %.0f years at %.2f%%, the investment will be worth $%.2f.", years, interest, total);
    }
}
