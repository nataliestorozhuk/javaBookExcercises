import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.io.*;
import java.lang.reflect.Array;
import java.sql.Date;
import java.time.LocalTime;
import java.util.*;

public class I5Methods {

    public static void run() {

        // showCharMethod("oleksandra", 7);
        // retailPriceCalculator();
        // rectangleArea();
        paintJobEstimator();

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
}
