package org.example;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        double height, weight, BMI;

        do {
            flag = true;

            try{
                System.out.print("PLease input your weight(LBS): ");
                weight = sc.nextDouble();

                System.out.print("Please input your height(IN): ");
                height = sc.nextDouble();

                BMI = (weight / (height * height)) * 703;

                if(BMI >= 18.5 && BMI <= 25)
                {
                    System.out.printf("Your BMI is %.1f.\n" +
                            "You are within the ideal weight range.", BMI);
                }
                else if(BMI > 25)
                    System.out.printf("Your BMI is %.1f.\n" +
                            "You are overweight. You should see your doctor.\n", BMI);
                else
                    System.out.printf("Your BMI is %.1f.\n" +
                            "You are underweight. You should see your doctor.\n", BMI);

            }catch (Exception InputMismatchException){
                flag = false;
            }

        }while(flag == false);
    }
}
