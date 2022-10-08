//Vishaun Jones
//3-10-2022
//CGS3416
//Assignment 4: Statistics
//Silei Song

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Statistics
{
    public static void main(String[] args) {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        double rangeMin = -10;
        double rangeMax = 20;
        double mean;
        double variance;
        double standardDev;
        double arrTotal = 0;
        double runTotal = 0;
        final int NUMS = 10;
       
        //Initialize Array
        double[] statisticsArr = new double[NUMS];
       
        //User Prompt
        System.out.println("Please enter 5 numbers:");
       
        //Loop: intake of user entered numbers and storage in Array
        for (int i = 0; i < 5; ++i) {
            statisticsArr[i] = in.nextDouble();
        }
       
        //Loop: generating random type double numbers to store in array
        for (int i = 5; i < NUMS; ++i) {
            statisticsArr[i] = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
        }

        //Loop: Creating a total of all the values in the array
        for (int i = 0; i < NUMS; ++i) {
            arrTotal += statisticsArr[i];
        }
       
        //Mean calculation
        mean = arrTotal/NUMS;
   
        //Loop: Subtracting each value in the array from the mean, squaring that value, then adding the result to a running total
        for (int i = 0; i < NUMS; ++i) {
            double sub = mean - statisticsArr[i];
            double sqr = Math.pow(sub, 2);
            runTotal += sqr;
        }
       
        //Variance calculation:
        variance = runTotal/NUMS;

        //Standard Deviation calculation: Calculating the SD by finding the square root of the Variance
        standardDev = Math.sqrt(variance);
       
        //Returing the array, mean, variance and standard deviation to the user
        System.out.print("The array is: ");
        for (int i = 0; i < NUMS - 1; ++i) {
            System.out.print(Math.round(statisticsArr[i] * 100) / 100 + ", ");
        }
        System.out.print(Math.round(statisticsArr[9] * 100) / 100);
       
        System.out.printf("\nThe mean is: %.2f %n", mean);
       
        System.out.printf("The variance is: %.2f %n", variance);
       
        System.out.printf("The standard deviation is: %.2f %n", standardDev);
    }
}