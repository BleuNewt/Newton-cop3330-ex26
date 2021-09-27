package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Newton
 */
import java.util.Scanner;
public class Exersise26
{
    public static int calculateMonthsUntilPaidOff(double bal, double apr, double pay)
    {
        apr = apr / 365;
        /* equation is      n = -1/30) * log(1 + b/p * (1- (1 + i)^30)) / log(1 + i) */
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + bal / pay * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));
    }
    public static void main(String[] args)
    {
        double bal, apr, pay;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your balance? ");
        bal = scanner.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = scanner.nextDouble();
        apr = apr / 100;

        System.out.print("What is the monthly payment you can make? ");
        pay = scanner.nextDouble();

        /* print result */
        int m = calculateMonthsUntilPaidOff(bal, apr, pay);
        System.out.println("It will take " + m + " months to pay off this card.");
    }
}
