import java.util.Scanner;

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
        forLoopToWhile();
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
}
