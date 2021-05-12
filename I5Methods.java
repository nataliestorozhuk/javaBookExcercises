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
        rectangleArea();

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
        System.out.println("The length of the rectancle is: " + l + "\n" + "The width of the rectancle is: "
                + w + "\n" + "The area of the rectancle is: " + area);

    }
}
