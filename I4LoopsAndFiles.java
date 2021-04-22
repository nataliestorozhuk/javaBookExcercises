import java.util.Scanner;

import jdk.nashorn.api.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.io.*;
import java.lang.reflect.Array;

public class I4LoopsAndFiles {

    public static void run() {

        // whileLoopExercise();
        // doWhileLoopExercise1();
        // forLoopExercise();
        // loopExercise2();
        // nestedLoop();
        // nestedLoop2();
        // convertinIntoDoWhileLoop();
        // convertinIntoWhileLoop();
        // whileLoopToFor();
        // forLoopToWhile();
        // inputValidationLoop();
        // inputValidationLoop2();
        // randomInteger();
        // randomInteger2();
        // openFileAndWrite();
        // readDataFromFile();
        // readDataFromFile2();
        // openFileWithoutErasingData();
        // sumOfNumbers();
        // distanceTraveled();
        // distanceFile();
        // penniesForPay();
        // letterCounter();
        // fileLetterCounter();
        // hotelOccupancy();
        // averageRainfall();
        // population();
        // largestAndSmallest();
        // largestAndSmallestNetVersion();
        // celsiusToFahrengeitTable();
        // barChart();
        // barChartVersion2();
        // fileHeadDisplay();
        // lineNumbers();
        // uppercaseFileConverter();
        // budgetAnalysis();
        // randomNumberGuessingGame();
        // randomNumberGuessingGameEnhancement();
        // espGame();
        squareDisplay();

    }

    public static void whileLoopExercise() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number:");
        double number = keyboard.nextDouble();

        double product = number * 2;

        while (product < 10) {
            System.out.print("The total is: " + product);

            product++;
        }

    }

    public static void doWhileLoopExercise1() {
        String input;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Please enter a number one: ");
            double number1 = keyboard.nextDouble();
            System.out.print("Please enter a number two: ");
            double number2 = keyboard.nextDouble();

            double total = number1 + number2;
            System.out.println("The total is: " + total);
            System.out.println();

            System.out.println("Do you want to perform this operation again?: ");
            System.out.println("Enter Yes for yes or No for no");
            input = keyboard.next();

        } while (input.equalsIgnoreCase("yes"));

    }

    public static void forLoopExercise() {

        for (int i = 0; i <= 60; i += 10) {

            System.out.println(i + " ");
        }

    }

    public static void loopExercise2() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = keyboard.nextInt();

        for (int i = number; i <= 10; i++) {

            System.out.println(number = +i);
        }
    }

    public static void nestedLoop() {
        int cols = 15;
        int rows = 10;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void nestedLoop2() {

        int cols = 7;
        int rows = 7;

        for (int col = 0; col < cols; col++) {

            System.out.println();

            // int row = rows; row > 0; row--
            for (int row = 0; row <= rows; row++) {
                System.out.print("#");
            }
            rows--;
        }

        System.out.println();
        System.out.println();

        for (int col = 0; col < 3; col++) {

            // int row = rows; row > 0; row--

            for (int row = 3; row >= col; row--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------");

        for (int col = 0; col < 5; col++) {

            for (int row = 5; row > col; row--) {
                System.out.print("0");

            }
            System.out.println();
        }
    }

    public static void convertinIntoDoWhileLoop() {
        Scanner keyboard = new Scanner(System.in);

        int x = 1;

        do {
            System.out.println("Enter a number: ");
            x = keyboard.nextInt();
        } while (x > 0);

    }

    public static void convertinIntoWhileLoop() {
        Scanner keyboard = new Scanner(System.in);
        String input;
        char sure = ' ';
        while (sure != 'Y' && sure != 'N') {
            System.out.println("Are you sure you want to quit? ");
            input = keyboard.next();
            sure = input.charAt(0);

        }
    }

    public static void whileLoopToFor() {

        int count = 0;

        // while (count < 50) {
        // System.out.println("count is: " + count);
        // count++;
        // }

        for (count = 0; count < 5; count++) {
            System.out.println("count is: " + count);
            // count++;
        }
    }

    public static void forLoopToWhile() {
        // For i loop we are converting from
        // for (int i = 10; i > 0; i--) {
        // System.out.println(i + "seconds to go.");
        // }

        int x = 10;
        while (x > 0) {
            System.out.println(x + "seconds to go.");
            x--;
        }
    }

    public static void inputValidationLoop() {
        Scanner keyboard = new Scanner(System.in);
        var input = 0;
        int x = 5;

        do {
            System.out.println("Enter a number in a range of 1-4: ");
            input = keyboard.nextInt();
        } while (x == 5);
    }

    public static void inputValidationLoop2() {
        Scanner keyboard = new Scanner(System.in);
        int y = 0;
        String input;

        while (y == 0) {
            System.out.println("Please enter the word yes or no: ");
            input = keyboard.next();
            if (!input.equalsIgnoreCase("yes")) {
                System.out.println("mistype");
                break;
            }

        }
    }

    public static void randomInteger() {
        int number;
        Random randomNumber = new Random();
        number = randomNumber.nextInt(10) + 1;

        System.out.println("The random number is: " + number);
    }

    public static void randomInteger2() {

        int number;
        Random randomNumber = new Random();
        number = randomNumber.nextInt(2);

        if (number == 1) {
            System.out.println("yes");
        } else if (number == 0) {
            System.out.println("no");
        }
    }

    public static void openFileAndWrite() {
        try {
            File file = new File("D:\\NumberList.txt");
            PrintWriter outputFile = new PrintWriter(file);
            // outputFile.println("i");
            // outputFile.close();
            for (int i = 0; i <= 100; i++) {
                outputFile.println(i);

            }
            outputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void readDataFromFile() {
        try {
            File fileName = new File("D:\\NumberList.txt");
            Scanner inputFile = new Scanner(fileName);

            while (inputFile.hasNext()) {
                int number = inputFile.nextInt();
                System.out.println(number);
            }
            inputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void readDataFromFile2() {
        int total = 0;
        try {
            File fileName = new File("D:\\NumberList.txt");
            Scanner inputFile = new Scanner(fileName);

            while (inputFile.hasNext()) {
                int number = inputFile.nextInt();

                total = total + number;
            }
            System.out.println("The total is: " + total);
            inputFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // In other words we need to append data to a file (use two paramaters in
    // constractor: String, bollean(true))
    public static void openFileWithoutErasingData() {

        try {
            FileWriter file = new FileWriter("D:\\NumberList.txt", true);
            PrintWriter outputFile = new PrintWriter(file);
            outputFile.println();
            outputFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sumOfNumbers() {
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a positive nonzero integer value: ");
        int value = keyboard.nextInt();

        for (int i = 1; i < value; i++) {
            sum = sum + value;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void distanceTraveled() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the speed of the veicle (in miles-per-hour): ");
        int speed = keyboard.nextInt();
        System.out.println("Enter a number of hours that the veicle had traveled: ");
        int hours = keyboard.nextInt();

        // int distance = speed * hours;
        int distanceTraveled = 0;
        System.out.println("Hour           Distance Traveled");
        System.out.println("------------------------");

        // System.out.println(distance);
        for (int i = 1; i <= hours; i++) {
            distanceTraveled += speed;
            System.out.println(i + "\t \t" + distanceTraveled);

        }

    }

    public static void distanceFile() {
        try {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the speed of the veicle (in miles-per-hour): ");
            int speed = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter a number of hours that the veicle had traveled: ");
            int hours = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter a file name:  ");
            String fileName = keyboard.nextLine();
            int distanceTraveled = 0;

            // Open the file
            PrintWriter outputFile = new PrintWriter("D:\\" + fileName);
            // Get data and write it to the file
            outputFile.println("Hour           Distance Traveled");
            outputFile.println("------------------------");
            // System.out.println(distance);
            for (int i = 1; i <= hours; i++) {
                distanceTraveled += speed;

                outputFile.println(i + "\t \t" + distanceTraveled);
            }
            outputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void penniesForPay() {

        int days = 10;
        double pennies = 1;
        var totalSalary = 0.0;

        System.out.println("days          salary for each day");
        System.out.println("---------------------------------");

        for (int i = 1; i <= days; i++) {

            // double penniesIncrementedByDay = pennies = pennies + 1;
            double penniesIncrementedByDay = pennies++;
            System.out.println(i + "\t\t" + penniesIncrementedByDay / 100);

            // totalSalary += penniesIncrementedByDay;
            totalSalary = totalSalary + penniesIncrementedByDay;
        }

        System.out.println("Total Salary for " + days + " days is " + totalSalary / 100);
    }

    public static void penniesForPayRewrite() {

        int days = 10;
        double pennies = 1;
        var totalSalary = 0.0;

        System.out.println("days          salary for each day");
        System.out.println("---------------------------------");

        for (int i = 1; i <= days; i++) {

            double penniesIncrementedByDay = pennies++;
            System.out.println(i + "\t\t" + penniesIncrementedByDay / 100);

            totalSalary = totalSalary + penniesIncrementedByDay;
        }

        System.out.println("Total Salary for" + days + " days is: " + totalSalary / 100);
    }

    public static void letterCounter() {
        String string;
        String character;
        int count = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any string: ");
        string = keyboard.nextLine();
        System.out.println("Enter any character: ");
        character = keyboard.next();

        for (int i = 0; i < string.length(); i++) {
            if (character.charAt(0) == string.charAt(i)) {
                count++;
            }

        }
        System.out.println("Letters: " + count);
    }

    public static void fileLetterCounter() {
        String fileName;
        char character;
        String textFile;
        int count = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        fileName = keyboard.nextLine();

        try {
            // Printing data to the file
            PrintWriter fileInfo = new PrintWriter("D:\\" + fileName);
            System.out.println("Enter text to the file : ");
            textFile = keyboard.nextLine();
            fileInfo.println(textFile);

            fileInfo.close();

            File openFile = new File("D:\\" + fileName);

            // checking if the file exist
            if (!openFile.exists()) {
                System.out.println("File does not exist");
            }

            else {
                System.out.println("File exist");
            }

            System.out.println("Please enter a character to count: ");
            character = keyboard.nextLine().charAt(0);

            // Looping through the textfile and finding the number of caracters that the
            // user has entered
            for (int i = 0; i < textFile.length(); i++) {
                if (textFile.charAt(i) == character) {
                    count++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("The numbers of letters in the file are: " + count);
    }

    public static void hotelOccupancy() {
        double numOfFloors;
        double numOfRoomsOnTheFloor = 0;
        double numOfOccupiedRooms = 0;
        double totalNumberOfOccupiedRoom = 0;
        double numOfVacantRoom = 0;
        double totalNumberOfRooms = 0;
        double occupancyRate;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of floors in the hotel: ");
        numOfFloors = scanner.nextInt();
        if (numOfFloors < 1) {
            System.out.println("Please do not enter a number less then 1. ");

        }

        for (int i = 0; i < numOfFloors; i++) {

            System.out.println("Enter the number of rooms on the floor: ");
            numOfRoomsOnTheFloor = scanner.nextInt();
            if (numOfRoomsOnTheFloor < 10) {
                System.out.println("Please do not enter less then 10");
                break;
            }

            System.out.println("Enter the number of rooms on the floor that are occupied: ");
            numOfOccupiedRooms = scanner.nextInt();

            totalNumberOfRooms += numOfRoomsOnTheFloor;
            totalNumberOfOccupiedRoom += numOfOccupiedRooms;
            numOfVacantRoom = totalNumberOfRooms - totalNumberOfOccupiedRoom;

        }
        occupancyRate = (totalNumberOfOccupiedRoom / totalNumberOfRooms) * 100;
        System.out.println("The number of rooms in the hotel are: " + totalNumberOfRooms);
        System.out.println("The number of occupied rooms in the hotel are: " + totalNumberOfOccupiedRoom++);
        System.out.println("The number of the rooms that are vacant:  " + numOfVacantRoom);
        System.out.println("The occupancy rate for the hotel is:  " + occupancyRate);

    }

    public static void averageRainfall() {

        int numberOfYears;
        double inchesOfRainfallForMonth = 0.0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of the years: ");
        numberOfYears = keyboard.nextInt();
        if (numberOfYears < 1) {
            System.out.println("wrong answer");
        }

        for (int i = 1; i <= numberOfYears; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println("Enter the inches of rainfall for an year" + i + " month" + j + ": ");
                inchesOfRainfallForMonth += keyboard.nextDouble();
                continue;
            }

        }
        keyboard.close();
        System.out.println("The number of months are: " + numberOfYears * 12);
        System.out.println("The total inches of ranifall are: " + inchesOfRainfallForMonth);
        System.out.printf("The average rainfall per month for the entire period is: " + "%.2f",
                +inchesOfRainfallForMonth / (numberOfYears * 12));
    }

    public static void population() {
        int startingNumOfOrgamisms;
        double populationIncrease;
        int numOfDays;
        double sizeOfPopulation = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the starting number of organisms: ");
        startingNumOfOrgamisms = keyboard.nextInt();
        // If else will not work here, because the program will still run even if the
        // imput is incorect.
        while (startingNumOfOrgamisms < 2) {
            System.out.println("Error: Enter the starting number of organisms (above 2): ");
            startingNumOfOrgamisms = keyboard.nextInt();
        }

        System.out.println("Enter the average daily population increase (as a percentage): ");
        populationIncrease = keyboard.nextInt();
        while (populationIncrease <= -1) {
            System.out.println(
                    "Error: Enter the average daily population increase (as a percentage), positive number please: ");
            populationIncrease = keyboard.nextInt();
        }
        double populationPercentage = populationIncrease / 100;
        System.out.println("Enter the number of days they will multiply: ");
        numOfDays = keyboard.nextInt();
        while (numOfDays < 1) {
            System.out.println("Error: Enter the number of days they will multiply (above 1, please): ");
            numOfDays = keyboard.nextInt();
        }

        System.out.println("Day           Daily Population");
        System.out.println("------------------------");
        sizeOfPopulation = startingNumOfOrgamisms;

        for (int day = 1; day <= numOfDays; day++) {

            sizeOfPopulation = sizeOfPopulation + (sizeOfPopulation * populationPercentage);
            System.out.println(day + "\t \t" + sizeOfPopulation);

        }

    }

    public static void largestAndSmallest() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number -99 to exit");
        System.out.println("Enter a numbers: ");

        ArrayList<Integer> arr = new ArrayList<Integer>();

        do {
            arr.add(keyboard.nextInt());

        } while (keyboard.nextInt() != -99);

        int max_value = 0;

        for (Integer n : arr) {
            if (n > max_value)
                max_value = n;
        }

        int min_value = arr.get(0);
        for (Integer n : arr) {
            if (n < min_value)
                min_value = n;
        }

        System.out.println(max_value + " " + min_value);

        // var x = Collections.min(Arrays.asList(intArr));

        // int[] arr = { 55, 3, 6, 333, 5 };
        // int smallest = 0;

        // for (int n : arr) {
        // if (n < smallest) {
        // smallest = n;

        // }

    }

    public static void largestAndSmallestNetVersion() {

        int[] userInteger = { 12, 2, 45, -36 };

        int smallest = userInteger[0];
        int largest = userInteger[0];

        for (int i = 1; i < userInteger.length; i++) {
            if (userInteger[i] > largest) {
                largest = userInteger[i];
            } else if (userInteger[i] < smallest) {
                smallest = userInteger[i];
            }
        }
        System.out.println("The current largest input: " + largest);
        System.out.println("The current smallest input: " + smallest);

        // Scanner kb = new Scanner(System.in);

        // int arraySize;

        // System.out.println("How many numbers will you be entering?");
        // arraySize = kb.nextInt();

        // int[] userInteger = new int[arraySize];
        // int number = 0;

        // while (userInteger[number] != -99) {

        // for (int index = 0; index < arraySize; index++) {

        // System.out.println("Enter -99 to exit program.");
        // System.out.println("Enter an integer.");
        // userInteger[index] = kb.nextInt();
        // }
        // // Assign element 0 of userInteger array to smallest and largest
        // int smallest = userInteger[0];
        // int largest = userInteger[0];

        // for (int i = 1; i<arraySize; i++)
        // {
        // if(userInteger[i] > largest)
        // {
        // largest = userInteger[i];
        // }
        // else if (userInteger[i] < smallest)
        // {
        // smallest = userInteger[i];
        // }
        // }
        // System.out.println("The current largest input: " + largest);
        // System.out.println("The current smallest input: " + smallest);

        // }

    }

    public static void celsiusToFahrengeitTable() {
        double fahrenheit = 0.0;

        System.out.println("Celsuim            Fahrenheit");
        System.out.println("------------------------------");

        for (int i = 0; i <= 20; i++) {

            fahrenheit = (9.0 / 5.0 * i) + 32;

            System.out.println(i + "\t \t \t" + fahrenheit);
        }

    }

    public static void barChart() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter today's sales for store1: ");
        int store1 = keyboard.nextInt();
        int st1 = store1 / 100;
        System.out.println("Enter today's sales for store2: ");
        int store2 = keyboard.nextInt();
        int st2 = store2 / 100;
        System.out.println("Enter today's sales for store3: ");
        int store3 = keyboard.nextInt();
        int st3 = store3 / 100;
        System.out.println("Enter today's sales for store4: ");
        int store4 = keyboard.nextInt();
        int st4 = store4 / 100;
        System.out.println("Enter today's sales for store5: ");
        int store5 = keyboard.nextInt();
        int st5 = store5 / 100;

        System.out.println("SALES BAR CHART");

        System.out.print("store1: ");
        for (int i = 1; i <= st1; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("store2: ");
        for (int i = 1; i <= st2; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("store3: ");
        for (int i = 1; i <= st3; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("store4: ");
        for (int i = 1; i <= st4; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("store5: ");
        for (int i = 1; i <= st5; i++) {
            System.out.print("*");
        }
    }

    public static void barChartVersion2() {

        Scanner keyboard = new Scanner(System.in);
        int numOfStores = 5;

        int[] arr = new int[numOfStores];
        // this loop gets user's input
        for (int i = 0; i < numOfStores; i++) {

            System.out.println("Enter today's sales for store:" + (i + 1));
            arr[i] = keyboard.nextInt();
        }
        // this loop used to print numbers of stores
        for (int i = 0; i < arr.length; i++) {

            System.out.print("store" + (i + 1) + ": ");
            // this loop divide user's imput and prints asterisks.
            for (int j = 0; j < arr[i] / 100; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    public static void fileHeadDisplay() {
        var fileLines = 5;

        // Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name: ");
        // String fileName = keyboard.nextLine();
        String fileName = new Scanner(System.in).nextLine();

        File file = new File("D:\\" + fileName);
        int counter = 0;

        try {
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext() && counter < 5) {
                String line = inputFile.nextLine();
                System.out.println(line);
                counter++;
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void lineNumbers() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = keyboard.nextLine();

        File file = new File("D:\\" + fileName);
        int lineNum = 1;
        try {
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                System.out.println(lineNum + ": " + inputFile.nextLine());
                lineNum = lineNum + 1;
            }

            inputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void uppercaseFileConverter() {

        // Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName1 = new Scanner(System.in).nextLine();
        System.out.println("Enter file name: ");
        String fileName2 = new Scanner(System.in).nextLine();

        File inFile = new File("D:\\" + fileName1);

        try {
            // Scanner allows me to read a data from a file
            Scanner inputFile = new Scanner(inFile);
            File outFile = new File("D:\\" + fileName2);
            // Print Writer allows me to open a file
            PrintWriter outputFile = new PrintWriter(outFile);
            // has.next (boolean) method means while this is true do next:
            while (inputFile.hasNext()) {
                outputFile.println(inputFile.nextLine().toUpperCase());
            }

            inputFile.close();
            outputFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void budgetAnalysis() {
        double sum = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the amount that you has budgeted for a month: ");
        double budgetedMoney = keyboard.nextDouble();
        System.out.println("Did you have any expenses? ");
        String answer = keyboard.next();
        if (answer.equalsIgnoreCase("yes")) {
            for (int i = 0; i < budgetedMoney; i++) {
                System.out.println("Please enter your expenses for the month (to stop: enter 0): ");
                double expenses = keyboard.nextDouble();
                sum += expenses;
                if (expenses == 0) {
                    break;
                }
            }

            if (sum > budgetedMoney) {
                System.out.println("You are under budget: " + (sum - budgetedMoney));
            } else if (sum < budgetedMoney) {
                System.out.println("Congradulations!!! You are over budget: " + (budgetedMoney - sum));
            }
        } else {
            System.out.println("There were no expenses for a month");
        }

    }

    public static void randomNumberGuessingGame() {

        Random randomNum = new Random();
        int number = randomNum.nextInt(5);

        Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.println("Please guess what the number is (from 0-5): ");
            int guessNumber = keyboard.nextInt();

            if (guessNumber == number) {
                System.out.println("Awesome!!! Your answer is correct. ");
                break;
            }

            else if (guessNumber < number) {
                System.out.println("Too low, try again.");
                continue;
            } else if (guessNumber > number) {
                System.out.println("Too high, try again. ");
                continue;
            }
        }

    }

    public static void randomNumberGuessingGameEnhancement() {

        int numberOfGuesses = 0;

        Random randomNum = new Random();
        int number = randomNum.nextInt(10);

        Scanner keyboard = new Scanner(System.in);

        while (true) {

            System.out.println("Please guess what the number is (from 0-10): ");
            int guessNumber = keyboard.nextInt();
            numberOfGuesses++;

            if (guessNumber == number) {
                System.out.println("Awesome!!! Your answer is correct.  The number of guesses is: " + numberOfGuesses);
                break;
            }

            else if (guessNumber < number) {
                System.out.println("Too low, try again.");
                continue;
            } else if (guessNumber > number) {
                System.out.println("Too high, try again. ");
                continue;
            }
        }
    }

    public static void espGame() {

        int counterGuessed = 0;
        int counterNotGuessed = 0;
        String computerChosenColor = "";
        for (int i = 0; i <= 3; i++) {

            Random randomNum = new Random();
            int number = randomNum.nextInt(5);

            if (number == 0) {
                computerChosenColor = "red";
            } else if (number == 1) {
                computerChosenColor = "green";
            } else if (number == 2) {
                computerChosenColor = "blue";
            } else if (number == 3) {
                computerChosenColor = "orange";
            } else if (number == 4) {
                computerChosenColor = "yellow";
            }

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the color that the computer has selected: ");
            String guessedColor = keyboard.next();

            if (computerChosenColor.equalsIgnoreCase(guessedColor)) {
                // System.out.println("The computer selected " + computerChosenColor + "\nYou
                // selected " + guessedColor);
                counterGuessed++;
            } else if (!computerChosenColor.equalsIgnoreCase(guessedColor)) {
                // System.out.println("The computer selected " + computerChosenColor + "\nYou
                // selected " + guessedColor);
                counterNotGuessed++;
            }
        }
        System.out.println("Matches are: " + counterGuessed + "\nNot matched are: " + counterNotGuessed);
    }

    public static void squareDisplay() {

        Scanner keyboard = new Scanner(System.in);

        int intNumber = 0;

        do {

            System.out.println("Please enter an integer not greater then 15: ");
            intNumber = keyboard.nextInt();
            int cols = intNumber;
            int rows = intNumber;

            if (intNumber <= 15) {
                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        System.out.print("x");
                    }
                    // I call the system out println method in order to advance the screen cursor to
                    // the next line at the end of each row. Without that statement, all the "x"
                    // will be printed in one long row on the screen.
                    System.out.println();
                }
            } else {
                System.out.println("Wrong, try again. The number has to be less then 15.");
            }

        } while (intNumber > 15);

    }

    // if (intNumber > 15) {
    // while (intNumber > 15) {

    // }
    // }
    // else if (intNumber <= 15) {
    // for (int r = 0; r < rows; r++) {
    // for (int c = 0; c < cols; c++) {
    // System.out.print("x");
    // }
    // // I call the system out println method in order to advance the screen cursor
    // to
    // // the next line at the end of each row. Without that statement, all the "x"
    // // will be printed in one long row on the screen.
    // System.out.println();
    // }

    // }

    // int cols;
    // int rows;

    // Scanner keyboard = new Scanner(System.in);
    // System.out.println("Please enter an integer not greater then 15: ");
    // int intNumber = keyboard.nextInt();

    // cols = intNumber;
    // rows = intNumber;

    // if (intNumber > 15) {
    // while (intNumber > 15) {

    // }
    // System.out.println("Wrong, try again. The number has to be less then 15.");
    // }
    // else if (intNumber <= 15) {
    // for (int r = 0; r < rows; r++) {
    // for (int c = 0; c < cols; c++) {
    // System.out.print("x");
    // }
    // // I call the system out println method in order to advance the screen cursor
    // to
    // // the next line at the end of each row. Without that statement, all the "x"
    // // will be printed in one long row on the screen.
    // System.out.println();
    // }

    // }

}
