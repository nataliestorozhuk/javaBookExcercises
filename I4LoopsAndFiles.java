import java.util.Scanner;
import java.util.Random;
import java.io.*;

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
        distanceTraveled();

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
}
