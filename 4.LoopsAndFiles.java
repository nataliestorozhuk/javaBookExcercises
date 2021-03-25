import java.util.Scanner;

class LoopsAndFiles {

    public static void run() {

        whileLoopExercise();

    }

    public static void whileLoopExercise() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number:");
        double number = keyboard.nextDouble();

        double product = number * 2;

        while (product < 10) {
            System.out.print("The total is: " + product);
        }

    }
}