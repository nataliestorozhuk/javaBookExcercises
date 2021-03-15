import java.util.Scanner;

class DecisionStructures {

    public static void run() {
        // ifElseStatement();
        // ifElseStatement1();
        // ifElseStatement2();
        // ifElseStatement3();
        convertingIfElseIntoSwich();
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

    public static void ifElseStatement3(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the numbers of hours outside: ");
        double hours = keyboard.nextDouble();

        if (hours >= 0 && hours <=80){
            System.out.println("The number is valid");
        }
        else{
            System.out.println("The number is not valid");
        }
    }

    public static void convertingIfElseIntoSwich(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select numbers from 1-4: ");
        int number = keyboard.nextInt();

        switch (number){
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

}
