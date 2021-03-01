import java.util.Scanner;

class JavaFundamentals {

    public static void run() {

        nameAgeAndAnnualIncome();
    }

    /////////////////////////////////

    public static void nameAgeAndAnnualIncome() {
        String name;
        int age;
        double annualPay;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("What is your age? ");
        age = keyboard.nextInt();

        System.out.println("What is your desired annual income? ");
        annualPay = keyboard.nextDouble();

        System.out.println("My name is " + name + "," + " my age is " + age + " and I hope to earn " + annualPay + " per year.");

    }

    public static int  nameAgeAndInitials() {

        return 10; 
    }

}