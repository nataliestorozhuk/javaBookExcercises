import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import java.lang.*;
import java.util.*;

class DecisionStructures {

    public static void run() {
        // ifElseStatement();
        // ifElseStatement1();
        // ifElseStatement2();
        // ifElseStatement3();
        // convertingIfElseIntoSwich();
        // romanNumerals();
        // magicDates();
        // bodyMassIndex();
        // salesPrediction();
        // massAndWeight();
        // timeCalculator();
        // sortedNames();
        // softwareSales();
        // shippingCharges();
        // fatGramCalculator();
        runningTheRace();

    }

    public static void ifElseStatement() {
        double amount1 = 5.0;
        double amount2 = 55;

        if (amount1 >= 10)

            if (amount2 <= 100)

                System.out.println();

    }

    public static void ifElseStatement1() {
        double number = 19;

        if (number <= 100) {
            System.out.println("The number is valid");
        } else {
            System.out.println("The number is invalid");
        }

    }

    public static void ifElseStatement2() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the temperature outside: ");
        double temperature = keyboard.nextDouble();

        if (temperature >= -50)
            if (temperature <= 150) {
                System.out.println("The number is valid");
            } else {
                System.out.println("The number is wrong");
            }
    }

    public static void ifElseStatement3() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the numbers of hours outside: ");
        double hours = keyboard.nextDouble();

        if (hours >= 0 && hours <= 80) {
            System.out.println("The number is valid");
        } else {
            System.out.println("The number is not valid");
        }
    }

    public static void convertingIfElseIntoSwich() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select numbers from 1-4: ");
        int number = keyboard.nextInt();

        switch (number) {
        case 1:
            System.out.println("You selected 1. ");
            break;
        case 2, 3:
            System.out.println("You selected 2 or 3. ");
            break;
        case 4:
            System.out.println("You selected 4. ");
            break;
        default:
            System.out.println("Select again please. ");

        }

    }

    public static void romanNumerals() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number within the range of 1 through 10: ");
        int number = keyboard.nextInt();

        switch (number) {
        case 1:
            System.out.println("You selected I. ");
            break;
        case 2:
            System.out.println("You selected II. ");
            break;
        case 3:
            System.out.println("You selected III. ");
            break;
        case 4:
            System.out.println("You selected IV. ");
            break;
        case 5:
            System.out.println("You selected V. ");
            break;
        case 6:
            System.out.println("You selected VI. ");
            break;
        case 7:
            System.out.println("You selected VII. ");
            break;
        case 8:
            System.out.println("You selected VIII. ");
            break;
        case 9:
            System.out.println("You selected IX. ");
            break;
        case 10:
            System.out.println("You selected X. ");
            break;
        default:
            System.out.println("Error message. ");

        }

    }

    public static void magicDates() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a month (in numeric form) of your DOB: ");
        int month = keyboard.nextInt();
        System.out.println("Please enter a day of your DOB: ");
        int day = keyboard.nextInt();
        System.out.println("Please enter a year of your DOB: ");
        String year = keyboard.next();
        var converting = Integer.parseInt(year.substring(2));

        if (converting == month * day) {

            // if (month * day == year) {
            System.out.println("The date is magic");
        } else {
            System.out.println("The date is not magic");
        }
    }

    public static void bodyMassIndex() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = keyboard.nextDouble();
        System.out.println("Please enter your height in inches: ");
        double height = keyboard.nextDouble();
        double sqrtHeight = Math.pow(height, 2);

        double bMI = weight * (703 / sqrtHeight);

        if (bMI >= 18.5 && bMI <= 25) {
            System.out.println("Your weight is optimal. ");
        } else if (bMI < 18.5) {
            System.out.println("You are considered underweight. ");
        } else if (bMI > 25) {
            System.out.println("You are considered overweight. ");
        } else {
            System.out.println("Something went wrong. ");
        }
    }

    public static void salesPrediction() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter amount of total sales: ");
        double totalSales = keyboard.nextDouble();

        double percent = 0.23;

        double x = totalSales * percent;
        System.out.println("The annual amount is: " + x);

    }

    public static void massAndWeight() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an object's mass (in kilograms): ");
        double objectsMass = keyboard.nextDouble();

        double weight = objectsMass * 9.8;

        if (weight > 1000) {
            System.out.println("The object is too heavy");
        } else if (weight < 10) {
            System.out.println("The object is too light");
        } else {
            System.out.println("The objects weight is normal");
        }

    }

    public static void timeCalculator() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number of seconds: ");
        double seconds = keyboard.nextDouble();

        int minute = 60;
        double hour = 3600;
        double day = 86400;
        double minutes = seconds / minute;
        double hours = seconds / hour;
        double days = seconds / day;

        if (seconds >= 60 && seconds < 3600) {
            System.out.println("There are " + minutes + "  minute(s). ");
        } else if (seconds >= 3600 && seconds < 86400) {
            System.out.println("There are " + hours + "  hour(s). ");
        } else if (seconds >= 86400) {
            System.out.println("There are " + days + "  day(s). ");
        }
    }

    public static void sortedNames() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter first name: ");
        String name1 = keyboard.next();
        System.out.println("Please enter second name: ");
        String name2 = keyboard.next();
        System.out.println("Please enter third name: ");
        String name3 = keyboard.next();

        // ArrayList<String> arr = new ArrayList<String>();
        // arr.add(name1);
        // arr.add(name2);
        // arr.add(name3);

        // Inline initialization of an ArrayList

        // ArrayList<String> arr = new ArrayList<String>(Arrays.asList(name1, name2,
        // name3));

        // String[] arr2 = {name1, name2, name3};

        List<String> namesArr = List.of(name1, name2, name3);
        Collections.sort(namesArr);

        // this method is used to sort an array
        // Collections.sort(namesArr);

        // System.out.println(arr);
        // int count = 0;
        for (String n : namesArr) {
            System.out.println(n);
            // count++;
        }

    }

    public static void softwareSales() {
        int packages = 51;
        double packageRetail = 99;

        if (packages >= 10 && packages <= 19) {
            double discount = packages * packageRetail * 0.2;
            double total = packageRetail * packages - discount;
            System.out.printf("The amount of discount is: " + "%.2f", discount);
            System.out.printf(". The total amount of the purchase after discount is: " + "%.2f", total);
        } else if (packages >= 20 && packages <= 49) {
            double discount = packages * packageRetail * 0.3;
            double total = packageRetail * packages - discount;
            System.out.printf("The amount of discount is: " + "%.2f", discount);
            System.out.printf(". The total amount of the purchase after discount is: " + "%.2f", total);
        } else if (packages >= 50 && packages <= 99) {
            double discount = packages * packageRetail * 0.4;
            double total = packageRetail * packages - discount;
            System.out.printf("The amount of discount is: " + "%.2f", discount);
            System.out.printf(". The total amount of the purchase after discount is: " + "%.2f", total);
        } else if (packages >= 100) {
            double discount = packages * packageRetail * 0.5;
            double total = packageRetail * packages - discount;
            System.out.printf("The amount of discount is: " + "%.2f", discount);
            System.out.printf(". The total amount of the purchase after discount is: " + "%.2f", total);
        }

    }

    public static void shippingCharges() {
        double packageWeight = 18.15;

        if (packageWeight <= 2) {
            System.out.printf("The shipping charges are: " + "%.2f", packageWeight * 1.10);
        } else if (packageWeight >= 2 && packageWeight <= 6) {
            System.out.printf("The shipping charges are: " + "%.2f", packageWeight * 2.20);
        } else if (packageWeight >= 6 && packageWeight <= 10) {
            System.out.printf("The shipping charges are: " + "%.2f", packageWeight * 3.70);
        } else if (packageWeight > 10) {
            System.out.printf("The shipping charges are: " + "%.2f", packageWeight * 3.80);
        }
    }

    public static void fatGramCalculator() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of calories in a food item:  ");
        double calories = keyboard.nextDouble();
        System.out.println("Please enter fat grams in a food item:  ");
        double fatGram = keyboard.nextDouble();

        double caloriesFromFat = fatGram * 9;
        double percentageOfCalories = caloriesFromFat / calories;

        if (percentageOfCalories < 30) {
            System.out.println("The food is low in fat");
        } else if (percentageOfCalories > calories) {
            System.out.println("The imput is invalid");
        }
    }

    public static void runningTheRace() {
        String runner1 = "Vasya";
        String runner2 = "Sam";
        String runner3 = "Peter";

        double time1 = 3;
        double time2 = 18.1;
        double time3 = 1;

        if (time1 < time2 && time1 < time3 && time2 < time3) {
            System.out.println(runner1 + time1 + "\n" + runner2 + time2 + "\n" + runner3 + time3);
        } else if (time1 < time2 && time1 < time3 && time3 < time2) {
            System.out.println(runner1 + time1 + "\n" + runner3 + time3 + "\n" + runner2 + time2);
        }
        if (time2 < time1 && time2 < time3 && time1 < time3) {
            System.out.println(runner2 + time2 + "\n" + runner1 + time1 + "\n" + runner3 + time3);
        } else if (time2 < time1 && time2 < time3 && time3 < time1) {
            System.out.println(runner2 + time2 + "\n" + runner3 + time3 + "\n" + runner1 + time1);
        }
        if (time3 < time1 && time3 < time2 && time1 < time2) {
            System.out.println(runner3 + time3 + "\n" + runner1 + time1 + "\n" + runner2 + time2);
        } else if (time3 < time1 && time3 < time2 && time2 < time1) {
            System.out.println(runner3 + time3 + "\n" + runner2 + time2 + "\n" + runner1 + time1);
        }
    }
}
