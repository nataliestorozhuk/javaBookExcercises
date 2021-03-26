import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import java.lang.*;
import java.util.*;

class I3DecisionStructures {

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
        // runningTheRace();
        // theSpeedOfSound();
        // mobileServiceProvider();
        // bankCharges();
        // bookClubPoints();
        // WifiDiagnosticTree();
        // restaurantSelector();
        restaurantSwitch();

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

    public static void theSpeedOfSound() {

        double airSpeedPerSecond = 1100;
        double waterSpeedPerSecond = 4900;
        double steelSpeedPerSecond = 16400;

        double airDistanse = 15000;
        double waterDistanse = 21000;
        double steelDistance = 18000;

        System.out.printf("The amount of time for air will take: " + "%.2f", airDistanse / airSpeedPerSecond);
        System.out.printf("\n" + "The amount of time for water will take: " + "%.2f",
                waterDistanse / waterSpeedPerSecond);
        System.out.printf("\n" + "The amount of time for steel will take: " + "%.2f",
                steelDistance / steelSpeedPerSecond);
    }

    public static void mobileServiceProvider() {

        double aPerMonth = 39.99;
        double aMinutes = 450;
        double aPerMinute = 0.45;

        double bPerMonth = 59.99;
        double bMinutes = 900;
        double bPerMinute = 0.40;

        double cPerMonth = 69.99;

        char letterOfPackage = 'C';
        double numberOfMinutes = 912;

        if (letterOfPackage == 'A' && numberOfMinutes <= 450) {
            System.out.println("The total charges are: " + aPerMonth + ".");
        } else if (letterOfPackage == 'A' && numberOfMinutes > 450) {
            double aTotal = aPerMinute * (numberOfMinutes - aMinutes) + aPerMonth;
            System.out.println("The total charges are: " + aTotal + ".");
        } else if (letterOfPackage == 'B' && numberOfMinutes <= 900) {
            System.out.println("The total charges are: " + bPerMonth + ".");
        } else if (letterOfPackage == 'B' && numberOfMinutes > 900) {
            double bTotal = bPerMinute * (numberOfMinutes - bMinutes) + bPerMonth;
            System.out.println("The total charges are: " + bTotal + ".");
        } else if (letterOfPackage == 'C') {
            System.out.println("The total charges are: " + cPerMonth + ".");
        }
    }

    public static void bankCharges() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the numher of checks written for the month: ");
        int checksPerMonth = keyboard.nextInt();

        double feePerMonth = 10;

        if (checksPerMonth < 20) {
            double checks = checksPerMonth * 0.10 + feePerMonth;
            System.out.printf("The bank's service fees for the month is: " + "%.2f", checks);
        } else if (checksPerMonth >= 20 && checksPerMonth <= 39) {
            double checks1 = checksPerMonth * 0.08 + feePerMonth;
            System.out.printf("The bank's service fees for the month is: " + "%.2f", checks1);
        } else if (checksPerMonth >= 40 && checksPerMonth <= 59) {
            double checks2 = checksPerMonth * 0.06 + feePerMonth;
            System.out.printf("The bank's service fees for the month is: " + "%.2f", checks2);
        } else if (checksPerMonth >= 60) {
            double checks3 = checksPerMonth * 0.04 + feePerMonth;
            System.out.printf("The bank's service fees for the month is: " + "%.2f", checks3);
        }

    }

    public static void bookClubPoints() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the numher of books that you purchased this month: ");
        int numOfBooks = keyboard.nextInt();

        int book1 = 5;
        int book2 = 15;
        int book3 = 30;
        int book4 = 60;

        if (numOfBooks == 1) {
            System.out.println("The numher of points awarded are: " + book1);
        } else if (numOfBooks == 2) {
            System.out.println("The numher of points awarded are: " + book2);
        } else if (numOfBooks == 3) {
            System.out.println("The numher of points awarded are: " + book3);
        } else if (numOfBooks >= 4) {
            System.out.println("The numher of points awarded are: " + book4);
        }

    }

    public static void WifiDiagnosticTree() {

        String problemQuestion = "Did that fix the problem?";
        String successMessage = "I am glad its working";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Reboot the computer and try to connect");
        String ok = keyboard.next();
        System.out.println(problemQuestion);
        String problem = keyboard.next();

        if (problem.equalsIgnoreCase("no")) {
            System.out.println("Reboot the router and try to connect");

        } else if (problem.equalsIgnoreCase("yes")) {
            System.out.println(successMessage);
            return;
        }

        System.out.println(problemQuestion);
        problem = keyboard.next();

        if (problem.equalsIgnoreCase("no"))

        {
            System.out.println("Make sure the cables between the router & modern areplugged in fermly.");
        } else if (problem.equalsIgnoreCase("yes")) {
            System.out.println(successMessage);
            return;
        }

        System.out.println(problemQuestion);
        problem = keyboard.next();

        if (problem.equalsIgnoreCase("no")) {
            System.out.println("Move the router to a new location and try to connect. ");
        } else if (problem.equalsIgnoreCase("yes")) {
            System.out.println(successMessage);
            return;
        }

        System.out.println(problemQuestion);
        problem = keyboard.next();

        if (problem.equalsIgnoreCase("no")) {
            System.out.println("Get a new router. ");
        } else if (problem.equalsIgnoreCase("yes")) {
            System.out.println(successMessage);
            return;
        }
        System.out.println("Get a new router. ");

    }

    public static void restaurantSelector() {

        String cafe1 = "Joe's Gourmet Burgers";
        String cafe2 = "Main Street Pizza Company";
        String cafe3 = "Corner Cafe";
        String cafe4 = "Mama's Fine Italian";
        String cafe5 = "The Chef's Kitchen";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Is anyone in  your party vegetarian? ");
        String vegetarian = keyboard.next();
        System.out.println("Is anyone in  your party vegan? ");
        String vegan = keyboard.next();
        System.out.println("Is anyone in  your party gluten free? ");
        String glutenFree = keyboard.next();

        if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no") && glutenFree.equalsIgnoreCase("yes")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cafe2 + "\n" + cafe3 + "\n" + cafe5);
        } else if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("yes")
                && glutenFree.equalsIgnoreCase("yes")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cafe3 + "\n" + cafe5);

        } else if (vegetarian.equalsIgnoreCase("no") && vegan.equalsIgnoreCase("no")
                && glutenFree.equalsIgnoreCase("no")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cafe1);
        } else if (vegetarian.equalsIgnoreCase("yes") && vegan.equalsIgnoreCase("no")
                && glutenFree.equalsIgnoreCase("no")) {
            System.out.println("Here are your restaurant choices: " + "\n" + cafe4);
        } else {
            System.out.print("Cook at home:)");
        }
    }

    public static void restaurantSwitch() {

        String cafe1 = "Joe's Gourmet Burgers";
        String cafe2 = "Main Street Pizza Company";
        String cafe3 = "Corner Cafe";
        String cafe4 = "Mama's Fine Italian";
        String cafe5 = "The Chef's Kitchen";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Is anyone in  your party vegetarian? ");

        String vegetarian = String.valueOf(keyboard.next().equalsIgnoreCase("yes") ? 1 : 0);

        System.out.println("Is anyone in  your party vegan? ");

        String vegan = String.valueOf(keyboard.next().equalsIgnoreCase("yes") ? 1 : 0);

        System.out.println("Is anyone in  your party gluten free? ");

        String glutenFree = String.valueOf(keyboard.next().equalsIgnoreCase("yes") ? 1 : 0);

        String[] inputArr = { vegetarian, vegan, glutenFree };
        var inputArrJoin1 = String.join("", inputArr);

        var inputArrJoin2 = String.join("", new String[] { vegetarian, vegan, glutenFree });

        // var x = String.valueOf(vegetarian) + String.valueOf(vegan) +
        // String.valueOf(glutenFree);
        String message = "Here are your restaurant choices: ";

        switch (inputArrJoin2) {

        case "100":
            print(message + "\n" + cafe4);
            break;
        case "101":
            print(message + "\n" + cafe2);
            break;
        case "111":
            print(message + "\n" + cafe3 + "\n" + cafe5);
            break;
        case "000":
            print(message + "\n" + cafe1);
            break;
        default:
            print("cook at home");

        }

    }

    public static void print(String x) {
        System.out.println(x);
    }

}
