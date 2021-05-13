import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

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

public class I5Methods {

    public static void run() {

        // showCharMethod("oleksandra", 7);
        // retailPriceCalculator();
        // rectangleArea();
        // paintJobEstimator();
        // fallDistance();
        // celsiumTemperatureTable();
        // testAverageAndGrade();
        // conversionProgram();
        distanceTraveledModification();

    }

    public static void showCharMethod(String name, int num) {
        System.out.println(name.charAt(num));

    }

    public static void retailPriceCalculator() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter item's wholesale cost: ");
        double wholeSaleCost = keyboard.nextInt();
        System.out.println("Please enter item's wholesale cost markup percentage: ");
        double markupPersantage = keyboard.nextInt();
        double markUpPersantageConv = markupPersantage / 100;
        double retailPrice = calculateRetail(wholeSaleCost, markUpPersantageConv);
        System.out.println("The retail price of the item is: " + calculateRetail(wholeSaleCost, markUpPersantageConv));

    }

    public static double calculateRetail(double wholesale, double markupPersantage) {
        double retailPrice = (wholesale * markupPersantage) + wholesale;
        return retailPrice;
    }

    public static void rectangleArea() {

        double length = getLenght();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);

    }

    public static double getLenght() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the rectangle's length: ");
        double length = keyboard.nextDouble();
        return length;
    }

    public static double getWidth() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the rectangle's width: ");
        double width = keyboard.nextDouble();
        return width;
    }

    public static double getArea(double l, double w) {
        double area = l * w;
        return area;
    }

    public static void displayData(double l, double w, double area) {
        System.out.println("The length of the rectancle is: " + l + "\n" + "The width of the rectancle is: " + w + "\n"
                + "The area of the rectancle is: " + area);

    }

    public static void paintJobEstimator() {

        double wallSpace = 115;
        double amountPerHourPerLabor = 18;
        double hoursOfLaborRequired = 8;
        double totalSquareFeetInRoom = 0;
        // double hoursOfLabor = getHoursOfLabor(totalSquareFeetInRoom, wallSpace,
        // hoursOfLaborRequired);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the price of the paint per gallon: ");
        double priceOfPaintPerGallon = keyboard.nextDouble();

        System.out.println("Enter the number of rooms to be painted: ");
        double numOfRoomToBePainted = keyboard.nextDouble();

        for (int i = 1; i <= numOfRoomToBePainted; i++) {

            System.out.println("Enter the square feet of wall space in room: " + i);
            double squareFeetInRoom = keyboard.nextDouble();
            totalSquareFeetInRoom += squareFeetInRoom;
        }

        System.out.println(
                "The number of gallons of paint required: " + getTheNumOfGallons(totalSquareFeetInRoom, wallSpace));
        System.out.println("The hours of labor required: "
                + getHoursOfLabor(totalSquareFeetInRoom, wallSpace, hoursOfLaborRequired));
        System.out.println(
                "The cost of the paint: " + getCostOfThePaint(totalSquareFeetInRoom, wallSpace, priceOfPaintPerGallon));
        System.out.println("The labor charges are: " + getLaborCharges(
                getHoursOfLabor(totalSquareFeetInRoom, wallSpace, hoursOfLaborRequired), amountPerHourPerLabor));
        System.out.println("The total cost of the paint job is: " + getTotalCostOfThePaintJob(
                getLaborCharges(getHoursOfLabor(totalSquareFeetInRoom, wallSpace, hoursOfLaborRequired),
                        amountPerHourPerLabor),
                getCostOfThePaint(totalSquareFeetInRoom, wallSpace, priceOfPaintPerGallon)));

    }

    public static double getTheNumOfGallons(double totalSquareFeetInRoom, double wallSpace) {
        double numOfGallons = totalSquareFeetInRoom / wallSpace;
        return numOfGallons;
    }

    public static double getHoursOfLabor(double totalSquareFeetInRoom, double wallSpace, double hoursOfLaborRequired) {
        double hoursOfLabor = (totalSquareFeetInRoom / wallSpace) * hoursOfLaborRequired;
        return hoursOfLabor;
    }

    public static double getCostOfThePaint(double totalSquareFeetInRoom, double wallSpace,
            double priceOfPaintPerGallon) {
        double costOfPaint = (totalSquareFeetInRoom / wallSpace) * priceOfPaintPerGallon;
        return costOfPaint;
    }

    public static double getLaborCharges(double hoursOfLabor, double amountPerHourPerLabor) {
        double laborCharges = hoursOfLabor * amountPerHourPerLabor;
        return laborCharges;
    }

    public static double getTotalCostOfThePaintJob(double laborCharges, double costOfThePaint) {
        double totalCost = laborCharges + costOfThePaint;
        return totalCost;
    }

    public static void fallDistance() {

        System.out.println(fallingDistance(3));
    }

    public static double fallingDistance(double fallingTime) {
        double g = 9.8;
        double timeToPowerOf = Math.pow(fallingTime, 2);
        double distance = 0.5 * g * timeToPowerOf;
        return distance;
    }

    public static void celsiumTemperatureTable() {
        System.out.println("Fahrengeit           Celsium");
        System.out.println("-----------------------------");

        for (int i = 0; i <= 20; i++) {
            double formated = celsium(i);
            DecimalFormat df = new DecimalFormat("#.00");
            String fahrengeitFormated = df.format(formated);

            // System.out.printf(i + "%.2f", celsium(i));
            // System.out.println(i + "\t \t" + celsium(i));
            System.out.println(i + "\t \t" + fahrengeitFormated);
        }

    }

    public static double celsium(double fahrengeit) {
        double celsiumTemp = 5.0 / 9 * (fahrengeit - 32);
        return celsiumTemp;
    }

    public static void testAverageAndGrade() {
        double totalScore = 0.0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the test score 1: ");
        double testScore1 = keyboard.nextDouble();
        System.out.println("Enter the test score 2: ");
        double testScore2 = keyboard.nextDouble();
        System.out.println("Enter the test score 3: ");
        double testScore3 = keyboard.nextDouble();
        System.out.println("Enter the test score 4: ");
        double testScore4 = keyboard.nextDouble();
        System.out.println("Enter the test score 5: ");
        double testScore5 = keyboard.nextDouble();
        totalScore = testScore1 + testScore2 + testScore3 + testScore4 + testScore5;

        System.out.println("Score Letter                Grade");
        System.out.println("---------------------------------");
        System.out.println(testScore1 + "\t \t" + determineGrade(testScore1));
        System.out.println(testScore2 + "\t \t" + determineGrade(testScore2));
        System.out.println(testScore3 + "\t \t" + determineGrade(testScore3));
        System.out.println(testScore4 + "\t \t" + determineGrade(testScore4));
        System.out.println(testScore5 + "\t \t" + determineGrade(testScore5));
        System.out.println("The average score is: " + getAverage(totalScore));

    }

    /**
     * Finding average test score. Or we can put those 5 test scores into method
     * parameters and then calculate the average by adding them first and then
     * dividing by 5.
     */
    public static double getAverage(double totalScore) {
        return totalScore / 5;
    }

    public static char determineGrade(double testScore) {
        char scoreLetter = ' ';
        if (testScore >= 90) {
            scoreLetter = 'A';
        } else if (testScore >= 80 && testScore <= 89) {
            scoreLetter = 'B';
        } else if (testScore >= 70 && testScore <= 79) {
            scoreLetter = 'C';
        } else if (testScore >= 60 && testScore <= 69) {
            scoreLetter = 'D';
        } else {
            scoreLetter = 'F';
        }
        return scoreLetter;
    }

    public static void conversionProgram() {
        double distanceInMeters;
        int number = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the distance in meters: ");
        distanceInMeters = keyboard.nextDouble();
        do {
            menu();
            System.out.print("Please enter your choice: ");
            number = keyboard.nextInt();

            if (number == 1) {
                showKilometers(distanceInMeters);
            } else if (number == 2) {
                showInches(distanceInMeters);
            } else if (number == 3) {
                showFeet(distanceInMeters);
            } else if (number == 4) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Error message.");
            }
        } while (number >= 1 && number <= 3);

    }

    public static void showKilometers(double distanceInMeters) {
        double kilometers = distanceInMeters * 0.001;
        System.out.println(distanceInMeters + " meters is " + kilometers + " kilometers");
        System.out.println(" ");
    }

    public static void showInches(double distanceInMeters) {
        double inches = distanceInMeters * 39.37;
        System.out.println(distanceInMeters + " meters is " + inches + " inches");
        System.out.println(" ");
    }

    public static void showFeet(double distanceInMeters) {
        double feet = distanceInMeters * 3.281;
        System.out.println(distanceInMeters + " meters is " + feet + " feet");
        System.out.println(" ");
    }

    public static void menu() {
        System.out.println("1. Convert to kilometers " + "\n" + "2. Convert to inches " + "\n" + "3. Convert to feet "
                + "\n" + "4. Quit the program ");

    }

    public static void distanceTraveledModification() {

        System.out.println(distance(85.5, 45));
    }

    public static double distance(double speed, double time) {
        double distance = speed * time;
        return distance;
    }
}
