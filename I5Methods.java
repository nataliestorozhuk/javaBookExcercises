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
        retailPriceCalculator();

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
        double markUpPersantageConv = markupPersantage/100;
        double retailPrice = calculateRetail(wholeSaleCost, markUpPersantageConv);
        System.out.println("The retail price of the item is: " + calculateRetail(wholeSaleCost, markUpPersantageConv));

    }

    public static double calculateRetail(double wholesale, double markupPersantage) {
        double retailPrice = (wholesale * markupPersantage) + wholesale;
        return retailPrice;
    }
}
