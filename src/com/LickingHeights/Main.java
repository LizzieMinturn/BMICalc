package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// BMI=kg/m*m, m=inches*(0.0254/1), inch= m*(1/0.0254), pounds=1kg*(2.204/1)
        //declare
        Scanner keyboard;
        int inches,feet,totalInches;
        double pounds,meters,BMI,kg;

        //initializing
        keyboard = new Scanner(System.in);

        System.out.println("What is your height?(only feet)");
        feet = keyboard.nextInt();
        System.out.println("What is your height in?(only inches)");
        inches = keyboard.nextInt();
        totalInches = (feet*12 + inches);
        meters = (totalInches*(0.0254/1));
        System.out.println("What is your weight?(in pounds)");
        pounds = keyboard.nextInt();
        kg = (pounds*(2.204/1));










    }
}
