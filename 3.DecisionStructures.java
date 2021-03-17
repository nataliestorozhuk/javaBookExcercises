import java.util.Scanner;
import java.lang.*;

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
        massAndWeight();

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
        }
        else {
            System.out.println("The objects weight is normal");
        }

    }
}
