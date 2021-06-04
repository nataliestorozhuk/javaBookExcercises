import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.io.*;
import java.lang.reflect.Array;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.*;

public class I6ArraysAndTheArrayListClass {

    public static void run() {

        // printValuesFromArray();
        // copyValuesFromOneArrayToAnother();
        // stringArray();
        // storeInArray();
        // storeInArrayAndPrint();
        // declaringTwoDimensionalArray();
        // summingTwoDimensionalArray();
        // summingColumn();
        summingRows();

    }

    public static void printValuesFromArray() {

        int[] refernces = { 5, 7, 9, 1, 5 };

        for (int i = 0; i < refernces.length; i++) {
            System.out.println(refernces[i]);
        }

    }

    public static void copyValuesFromOneArrayToAnother() {

        int[] numberArray1 = { 5, 3, 6, 4, 1, 1, 3, 6, 9 };
        int[] numberArray2 = new int[numberArray1.length];

        for (int i = 0; i < numberArray1.length; i++) {
            numberArray2[i] = numberArray1[i];
            System.out.println(numberArray2[i] + "\t\t" + numberArray1[i]);

        }

    }

    public static void stringArray() {
        int totalStringInArray = 0;
        String[] names = { "Einstein", "Newton", "Copernicus", "Kepler" };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            totalStringInArray += names[i].length();
        }
        System.out.println(totalStringInArray);
    }

    public static void storeInArray() {

        String countryName[] = new String[3];
        int population[] = new int[3];

        for (int i = 0; i < countryName.length; i++) {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter the name of the country " + (i + 1) + ":");
            countryName[i] = keyboard.next();

            System.out.println("Enter the population for the country " + (i + 1) + ":");
            population[i] = keyboard.nextInt();

        }
        System.out.println("Country name" + "\t\t" + "Population");

        for (int j = 0; j < population.length; j++) {

            System.out.println(countryName[j] + "\t\t" + population[j]);
        }

    }

    public static void storeInArrayAndPrint() {

        int idNumber[] = new int[2];
        double grossPay[] = new double[2];

        for (var i = 0; i < idNumber.length; i++) {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter the id number of employee " + (i + 1) + ":");
            idNumber[i] = keyboard.nextInt();

            System.out.println("Enter the weekly gross pay of the employee " + (i + 1) + ":");
            grossPay[i] = keyboard.nextDouble();

        }

        System.out.println("Id number" + "\t\t" + "Gross Pay");

        for (int i = 0; i < grossPay.length; i++) {

            System.out.println(idNumber[i] + "\t\t" + grossPay[i]);
        }
    }

    public static void declaringTwoDimensionalArray() {

        // Declaring a two dimensional array with 30 rows and 10 columns.

        // int[][] grades = new int[30][10];

        int[][] numberArray = new int[9][11];
        // assigning 145 to the first column of the first row of this arr.
        numberArray[0][0] = 145;
        numberArray[8][10] = 18;

    }

    public static void summingTwoDimensionalArray() {

        // double[][] arr = { { 5.9, 3.58, 5.0, 6.7 },
        // { 9.5, 3.9, 5.0, 3.4 }
        // };

        int[][] arr = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

        int total = 0;

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                total += arr[row][col];
            }

        }
        System.out.println("The total is: " + total);
    }

    public static void summingColumn() {

        int[][] days = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        int columnTotal = 0;

        for (int i = 0; i < days.length; i++) {
            // or you can change number 3 to any other, depends what column you want to add.
            columnTotal += days[i][3];
        }

        System.out.println(columnTotal);
    }

    public static void summingRows() {
        int[][] days = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        int rowTotal = 0;

        // System.out.println("Total of row is " + rowTotal);
    }

}
