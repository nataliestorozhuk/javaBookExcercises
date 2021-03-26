import java.util.Scanner;

public class LoopsAndFiles {

    public static void run() {

        // whileLoopExercise();
        // doWhileLoopExercise1();
        // forLoopExercise();
        // loopExercise2();
        nestedLoop();
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
}
